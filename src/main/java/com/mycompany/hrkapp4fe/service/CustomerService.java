package com.mycompany.hrkapp4fe.service;

import java.util.List;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;

public interface CustomerService {
	
	List<CustomerDTO> getAll(int start, int size, CustomerDTO customerDTO);
	int count();

}
