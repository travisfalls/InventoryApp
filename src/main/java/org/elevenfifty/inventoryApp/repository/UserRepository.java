package org.elevenfifty.inventoryApp.repository;

import org.elevenfifty.inventoryApp.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
