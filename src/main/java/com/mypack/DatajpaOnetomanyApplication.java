package com.mypack;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mypack.entity.Customer;
import com.mypack.entity.Order;
import com.mypack.repository.CustomerRepository;

@SpringBootApplication
public class DatajpaOnetomanyApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DatajpaOnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		  Customer customer= new Customer(101, "A", 900003245L); Order order1 = new
		  Order(91911,"TV",5000.0); Order order2 = new Order(91922,"Laptop",25000.0);
		  Order order3 = new Order(91933,"BAG",600.0);
		  
		  Set<Order> orders = new HashSet<Order>();
		  
		  orders.add(order1); orders.add(order2); orders.add(order3);
		  
		  customer.setOrders(orders);
		  
		  CustomerRepository custRepo = (CustomerRepository)
		  ctx.getBean("customerRepository");
		  
		  custRepo.save(customer);
		 
	}

}
