package com.mycompany.hrkapp4fe.service;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;
import com.mycompany.hrkapp4fe.dto.CustomerPageDTO;

public interface CustomerService {
	
	CustomerPageDTO getAll(int start, int size, CustomerDTO customerDTO);
	int count();

}
