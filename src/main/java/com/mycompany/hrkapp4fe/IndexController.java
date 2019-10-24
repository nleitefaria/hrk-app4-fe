package com.mycompany.hrkapp4fe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;
import com.mycompany.hrkapp4fe.model.CustomerLazyDataModel;

@ManagedBean(name = "index")
@RequestScoped
public class IndexController {
	
	private String message;
	
	CustomerLazyDataModel dataModel = new CustomerLazyDataModel();

    

    public IndexController(){
        message = "Salut !!!!!!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public LazyDataModel<CustomerDTO> getModel(){
        return dataModel;
    }

}
