package com.ushwamala.msscbrewery.services;

import com.ushwamala.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Ushamah Wamala")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(customerDto.getId())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        System.out.println("updated!");
    }

    @Override
    public void deleteById(UUID customerId) {
        System.out.println("deleted!");
    }
}
