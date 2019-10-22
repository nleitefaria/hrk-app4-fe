package com.mycompany.hrkapp4fe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "index")
@RequestScoped
public class IndexController {
	
	private String message;

    public IndexController(){
        message = "Salut !!!!!!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
