package org.elevenfifty.inventoryApp.repository;

import org.elevenfifty.inventoryApp.beans.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
