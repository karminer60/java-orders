package com.lambdaschool.orders.repositories;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    Customer findByNameLike (String subname);

    @Query(value = "" =, nativeQuery = true)
    List<Orders> getOrders()
}
