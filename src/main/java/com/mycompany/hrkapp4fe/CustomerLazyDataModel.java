package com.mycompany.hrkapp4fe;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

public class CustomerLazyDataModel extends LazyDataModel<CustomerDTO> 
{	
	private static final long serialVersionUID = 551614594141174353L;
	
	public CustomerLazyDataModel(){	
		CustomerService s = new CustomerService();
        this.setRowCount(s.count());
    }
    
    public List<CustomerDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	CustomerService s = new CustomerService();
        return s.getAll(first / 10, pageSize);
    }

}