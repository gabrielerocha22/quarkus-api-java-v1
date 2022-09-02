package br.com.ibm.gabriele.crud.customer.controller;

import java.util.List;

import javax.inject.Inject;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ibm.gabriele.crud.customer.entity.Customer;
import br.com.ibm.gabriele.crud.customer.service.CustomerService;

@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController {

	@Inject
	CustomerService service;

	@GET
	public Response listCustomers() {
		List<Customer> customers = service.listCustomer();
		return Response.ok(customers).build();
	}

	
	@POST
	@Path("{id}")
	public Response saveCustomer(Customer customer1) {
		Customer customer = service.saveCustomer(customer1);
		return Response.ok(customer).status(201).build();

	}

	@PUT
	@Path("{id}")
	public Response updateCustomer(@PathParam("id") Long id, Customer dto) {
		service.updateCustomer(id, dto);
		return Response.status(204).build();
	}

	@DELETE
	@Path("{id}")
	public Response removeCustomer(@PathParam("id") Long id) {
		service.removeCustomer(id);
		return Response.status(204).build();
	}
}
