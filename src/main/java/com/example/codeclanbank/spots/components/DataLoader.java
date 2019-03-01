package com.example.codeclanbank.spots.components;

import com.example.codeclanbank.spots.models.Customer;
import com.example.codeclanbank.spots.models.Merchant;
import com.example.codeclanbank.spots.models.Payment;
import com.example.codeclanbank.spots.repositories.CustomerRepository;
import com.example.codeclanbank.spots.repositories.MerchantRepository;
import com.example.codeclanbank.spots.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MerchantRepository merchantRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer = new Customer("Groundskeeper Willie");
        customerRepository.save(customer);

        Merchant merchant = new Merchant("Kwikee Mart", "Springfield");
        merchantRepository.save(merchant);

        Payment payment = new Payment(12.99, merchant);
        paymentRepository.save(payment);

    }
}
