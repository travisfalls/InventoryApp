package org.elevenfifty.inventoryApp.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.elevenfifty.inventoryApp.beans.Product;
import org.elevenfifty.inventoryApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepo;


	@GetMapping("")
	public String index(Model model, HttpServletRequest request) {
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		return "index";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/products")
	public String products(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "products";
	}

	@GetMapping("/product/{id}/delete")
	public String productDelete(Model model, @PathVariable(name = "id") long id) {
		model.addAttribute("id", id);
		Product p = productRepo.findOne(id);
		model.addAttribute("product", p);
		return "product_delete";
	}

	@PostMapping("/product/{id}/delete")
	public String productDeleteSave(@PathVariable(name = "id") long id, @ModelAttribute @Valid Product product,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("product", product);
			return "product_delete";
		} else {
			productRepo.delete(product);
			return "redirect:/products";
		}

	}

	@GetMapping("/product/create")
	public String productCreate(Model model) {

		return "product_create";
	}

	@PostMapping("/product/create")
	public String productCreateSave(@ModelAttribute @Valid Product product, Model model) {

		productRepo.save(product);
		return "redirect:/product/" + product.getId();
	}

	@GetMapping("/product/{id}")
	public String product(Model model, @PathVariable(name = "id") long id) {
		model.addAttribute("id", id);
		Product p = productRepo.findOne(id);
		model.addAttribute("product", p);
		return "product_detail";
	}

	@GetMapping("/product/{id}/edit")
	public String productEdit(Model model, @PathVariable(name = "id") long id) {
		model.addAttribute("id", id);
		Product p = productRepo.findOne(id);
		model.addAttribute("product", p);
		return "product_edit";
	}

	@PostMapping("/product/{id}/edit")
	public String productEditSave(@PathVariable(name = "id") long id, @ModelAttribute @Valid Product product,
			BindingResult result, Model model) {

			productRepo.save(product);
			return "redirect:/product/" + product.getId();
	}

}