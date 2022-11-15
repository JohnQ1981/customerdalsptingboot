package com.customerdal.jq.repos;

import org.springframework.data.repository.CrudRepository;

import com.customerdal.jq.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
