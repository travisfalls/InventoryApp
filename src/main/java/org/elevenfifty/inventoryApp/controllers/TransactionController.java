package org.elevenfifty.inventoryApp.controllers;

import javax.validation.Valid;


import org.elevenfifty.inventoryApp.beans.Transaction;
import org.elevenfifty.inventoryApp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepo;

	@GetMapping("/transactions")
	public String home(Model model) {
		model.addAttribute("transactions", transactionRepo.findAll());
		return "transactions";
	}
	
	@GetMapping("/transaction/{id}/delete")
	public String transactionDelete(Model model, @PathVariable(name = "id") long id) {
		model.addAttribute("id", id);
		Transaction t = transactionRepo.findOne(id);
		model.addAttribute("transaction", t);
		return "transaction_delete";
	}

	@PostMapping("/transaction/{id}/delete")
	public String transactionDeleteSave(@PathVariable(name = "id") long id, @ModelAttribute @Valid Transaction transaction,
			BindingResult result, Model model) {

			transactionRepo.delete(transaction);
			return "redirect:/transactions";
	}

}
