package br.com.ibm.gabriele.crud.customer.service;


import java.util.List;


import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import br.com.ibm.gabriele.crud.customer.entity.Customer;


@ApplicationScoped
public class CustomerService {

	public List<Customer> listCustomer() {
		return Customer.listAll();
	}

	@Transactional
	public Customer saveCustomer(Customer customer1) {
		Customer customer = new Customer();

		customer.setName(customer1.getName());
		customer.setEmail(customer1.getEmail());
		customer.setAge(customer1.getAge());

		return customer;

	}

	@Transactional
	public void updateCustomer(Long id, Customer customer1) {

		Customer customer = new Customer();

		Optional<Customer> customerOp = Customer.findByIdOptional(id);

		if (customerOp.isEmpty()) {
			throw new NullPointerException("Not found!");
		}

		customer = customerOp.get();
		customer.setName(customer1.getName());
		customer.setEmail(customer1.getEmail());
		customer.setAge(customer1.getAge());
		customer.persist();
	}

	@Transactional
	public void removeCustomer(Long id) {

		Optional<Customer> customerOp = Customer.findByIdOptional(id);
		
		if (customerOp.isEmpty()) {
			throw new NullPointerException("Not foud!");
		}
		
		Customer customer = customerOp.get();
		customer.delete();

	}

}



