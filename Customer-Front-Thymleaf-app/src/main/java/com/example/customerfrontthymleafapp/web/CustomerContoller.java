package com.example.customerfrontthymleafapp.web;


import com.example.customerfrontthymleafapp.entities.Customer;
import com.example.customerfrontthymleafapp.repositories.CustomerRepository;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerContoller {

    @Autowired
    private CustomerRepository customerRepository;

     @GetMapping("/customers")
     public String customers(Model model)
     {
         List<Customer> ListCustomers = customerRepository.findAll();
         model.addAttribute("customers",ListCustomers);
         return "customers";
     }
}
