package com.codewithabdo.render_application1_api.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<Customer>CUSTOMERS=List.of(
            new Customer(1L,"HamedKhalid","hamedragab538@gmail.com"),
            new Customer(2L,"aliMo","ali@gmial.com"),
            new Customer(3L,"abdoKhalid","abdo@gmail.com"),
            new Customer(4L,"mohsenAli","mohsen@gmail,com")
    );
    @GetMapping
    public List<Customer>findAllCustomer(){
        return CUSTOMERS;
    }
}
