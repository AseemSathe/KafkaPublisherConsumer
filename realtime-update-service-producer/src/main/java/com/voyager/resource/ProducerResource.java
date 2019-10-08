package com.voyager.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyager.model.Account;
import com.voyager.model.ContactInfo;
import com.voyager.model.Customer;
import com.voyager.model.Transaction;

@RestController
@RequestMapping("kafka")
public class ProducerResource {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@PostMapping("/publish/transaction")
	public String postTransaction(@Valid @RequestBody Transaction transaction) {
		
		System.out.println(transaction.toString());
		kafkaTemplate.send("Kafka_Transaction", transaction);
		return "Published Successfully";
	}
	
	@PostMapping("/publish/customer")
	public String postCustomerInfo(@Valid @RequestBody Customer customer) {
		
		System.out.println(customer.toString());
		kafkaTemplate.send("Kafka_Customer", customer);
		return "Published Successfully";
	}
	
	@PostMapping("/publish/contactInfo")
	public String postContactInfo(@Valid @RequestBody ContactInfo contactInfo) {
		
		System.out.println(contactInfo.toString());
		kafkaTemplate.send("Kafka_Contact", contactInfo);
		return "Published Successfully";
	}
	
	@PostMapping("/publish/account")
	public String postTransaction(@Valid @RequestBody Account account) {
		
		System.out.println(account.toString());
		kafkaTemplate.send("Kafka_Account", account);
		return "Published Successfully";
	}
}
