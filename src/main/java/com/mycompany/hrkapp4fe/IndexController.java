package com.mycompany.hrkapp4fe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;
import com.mycompany.hrkapp4fe.model.CustomerLazyDataModel;

@ManagedBean(name = "index")
@RequestScoped
public class IndexController {
	
	
	private CustomerLazyDataModel dataModel = new CustomerLazyDataModel();
	
	private String name;	
	private String phone;
	
	private CustomerDTO customerDTO;
    

    public IndexController(){
    	customerDTO = new CustomerDTO();
    }


	public CustomerLazyDataModel getDataModel() {
		return dataModel;
	}


	public void setDataModel(CustomerLazyDataModel dataModel) {
		this.dataModel = dataModel;
	}


	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}


	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	} 
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void create()
	{
		System.out.println(this.customerDTO.getName());
		System.out.println(this.customerDTO.getPhone());
	}

}
