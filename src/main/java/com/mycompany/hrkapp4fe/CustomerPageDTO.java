package com.mycompany.hrkapp4fe;

import java.util.List;

public class CustomerPageDTO {
	
	private List<CustomerDTO> content;
	private boolean last;
	private int totalPages;
	private int totalElements;	
	private boolean first;
	private String sort;
	private int numberOfElements;
	private int size;
	private int number;
	
	public CustomerPageDTO() {
		super();
	}

	public CustomerPageDTO(List<CustomerDTO> content, boolean last, int totalPages, int totalElements, boolean first,
			String sort, int numberOfElements, int size, int number) {
		super();
		this.content = content;
		this.last = last;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.first = first;
		this.sort = sort;
		this.numberOfElements = numberOfElements;
		this.size = size;
		this.number = number;
	}

	public List<CustomerDTO> getContent() {
		return content;
	}

	public void setContent(List<CustomerDTO> content) {
		this.content = content;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
}
