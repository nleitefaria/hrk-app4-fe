package com.mycompany.hrkapp4fe.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.hrkapp4fe.dto.CustomerDTO;
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
    	System.out.println("@load");
    	CustomerServiceImpl s = new CustomerServiceImpl();
    	
    	if (filters!=null) {
        	
            for(Map.Entry<String,Object> e : filters.entrySet()) {
                if (e.getValue()!=null){
                	System.out.println(" *********** key: "+e.getKey()+" value: "+e.getValue());
                	
                }
            }
    	}
    	
        return s.getAll(first / 10, pageSize);
    }

}