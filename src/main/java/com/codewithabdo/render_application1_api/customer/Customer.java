package com.codewithabdo.render_application1_api.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private Long customerId;
    private String fullName;
    private String email;
}
