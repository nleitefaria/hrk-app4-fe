package com.mycompany.hrkapp4fe.service.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;
import com.mycompany.hrkapp4fe.dto.CustomerPageDTO;
import com.mycompany.hrkapp4fe.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	final String path = "https://hrk-app4.herokuapp.com/customers"; 
	
	public CustomerServiceImpl(){}
	
    public List<CustomerDTO> getAll(int start, int size)
    {   	
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/page/" + (start + 1));
        Response response = target.request().get();
        CustomerPageDTO value = response.readEntity(CustomerPageDTO.class);
        response.close();
        return value.getContent();
    }

    public int count()
    {
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/count");
        Response response = target.request().get();
        Long value = response.readEntity(Long.class);       
        response.close();
        return value.intValue();
    }
    
    
    
     
    
}