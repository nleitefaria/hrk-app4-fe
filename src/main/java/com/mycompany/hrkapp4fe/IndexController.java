package com.mycompany.hrkapp4fe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

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
