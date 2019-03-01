package com.example.codeclanbank.spots;

import com.example.codeclanbank.spots.models.Customer;
import com.example.codeclanbank.spots.models.Merchant;
import com.example.codeclanbank.spots.models.Payment;
import com.example.codeclanbank.spots.repositories.CustomerRepository;
import com.example.codeclanbank.spots.repositories.MerchantRepository;
import com.example.codeclanbank.spots.repositories.PaymentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpotsApplicationTests {

	@Autowired
	MerchantRepository merchantRepository;

	@Autowired
	CustomerRepository customerRepository;


	@Autowired
	PaymentRepository paymentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateMerchant(){
		Merchant merchant = new Merchant("Mels Novelty Hut",
				"Springfield");
		assertEquals( merchant.getName(), "Mels Novelty Hut");
	}

	@Test
	public void canCreateMerchantAndSaveToDB(){
		List<Merchant> found = merchantRepository.findAll();
		assertEquals(found.get(0).getName(), "Kwikee Mart");
		assertEquals(found.get(0).getLocation(), "Springfield");
	}

	@Test
	public void canCreateCustomer(){
		Customer customer = new Customer("Groundskeeper Willie");
		assertEquals(customer.getName(), "Groundskeeper Willie");
	}

	@Test
	public void canCreateAndSaveCustomerToDb(){
		List<Customer> found = customerRepository.findAll();
		assertEquals(found.get(0).getName(), "Groundskeeper Willie");
	}

	@Test
	public void canCreatePayment(){
		Payment payment = new Payment(12.99);
		assertEquals(payment.getAmount(), 12.99,0.0);
	}

	@Test
	public void canCreateAndSavePaymentToDb(){

		List<Payment> found = paymentRepository.findAll();
		assertEquals(found.get(0).getAmount(),12.99,0.0);
	}

	@Test
	public void canRelateMerchantAndPayment(){

		// query db to get payment
		Optional<Payment> foundPayment = paymentRepository.findById(1L);
		// get the payments merchant
		Merchant foundMerchant = foundPayment.get().getMerchant();

		// check that merchant is kwikee mart
		assertEquals("Kwikee Mart", foundMerchant.getName());
	}
}
