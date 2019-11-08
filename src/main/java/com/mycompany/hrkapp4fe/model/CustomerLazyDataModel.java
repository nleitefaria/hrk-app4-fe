package com.mycompany.hrkapp4fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;
import com.mycompany.hrkapp4fe.dto.CustomerPageDTO;
import com.mycompany.hrkapp4fe.service.impl.CustomerServiceImpl;

public class CustomerLazyDataModel extends LazyDataModel<CustomerDTO> 
{	
	private static final long serialVersionUID = 551614594141174353L;
	
	public CustomerLazyDataModel(){	
		CustomerServiceImpl s = new CustomerServiceImpl();
        this.setRowCount(s.count());
    }
    
    public List<CustomerDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	CustomerServiceImpl s = new CustomerServiceImpl();  	
    	CustomerDTO customerDTO = null;
    	if (filters!=null) {          
            String name = "";
            String phone = "";
            if(filters.get("name") != null)
            {
            	name = filters.get("name").toString();
            }
            if(filters.get("phone") != null)
            {
            	phone = filters.get("phone").toString();
            }           
            customerDTO = new CustomerDTO(name, phone);
    	}
    	else
    	{
    		customerDTO = new CustomerDTO("", "");
    	}	
    	
    	CustomerPageDTO customerPageDTO = s.getAll(first / 10, pageSize, customerDTO);
    	
    	this.setRowCount((int) customerPageDTO.getTotalElements());
        return customerPageDTO.getContent();
    }
}