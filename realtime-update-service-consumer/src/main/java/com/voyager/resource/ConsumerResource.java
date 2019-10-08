package com.voyager.resource;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.voyager.model.Account;
import com.voyager.model.ContactInfo;
import com.voyager.model.Customer;
import com.voyager.model.Transaction;

@Service
public class ConsumerResource {

	@KafkaListener(topics="Kafka_Transaction", groupId="groupJson", containerFactory = "transactionKafkaListenerFactory")
	public void consumeTransaction(Transaction transaction) {
		
		System.out.println(transaction);
	}
	
	@KafkaListener(topics="Kafka_Customer", groupId="groupJson", containerFactory = "customerKafkaListenerFactory")
	public void consumeCustomer(Customer customer) {
		
		System.out.println(customer);
	}
	
	@KafkaListener(topics="Kafka_Contact", groupId="groupJson", containerFactory = "contactInfoKafkaListenerFactory")
	public void consumeContactInfo(ContactInfo contactInfo) {
		
		System.out.println(contactInfo);
	}
	
	@KafkaListener(topics="Kafka_Account", groupId="groupJson", containerFactory = "accountKafkaListenerFactory")
	public void consumeTransaction(Account account) {
		
		System.out.println(account);
	}
}
