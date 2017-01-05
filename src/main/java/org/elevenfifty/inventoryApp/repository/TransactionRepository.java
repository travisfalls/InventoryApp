package org.elevenfifty.inventoryApp.repository;

import org.elevenfifty.inventoryApp.beans.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
