package com.customerdal.jq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.customerdal.jq.entity.Customer;
import com.customerdal.jq.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository repo;
	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("john");
		customer.setEmail("jq@gmail.com");
		repo.save(customer);
	}

		@Test
		void testFindCustomerById() {
			Customer customer = repo.findById(1l).get();
			System.out.println(customer);			
		}
		
		@Test 
		void testCustomerUpdate() {
			Customer customer = repo.findById(1l).get();
			customer.setEmail("updatejq@gmail.com");
			repo.save(customer);
		}
		@Test
		void testDeleteCustomer() {
			Customer customer = repo.findById(1l).get();
			repo.delete(customer);
		}
		
}
