package com.mycompany.hrkapp4fe.dto;

public class PageableDTO {
	
	SortDTO sort;
	 private float pageNumber;
	 private float pageSize;
	 private float offset;
	 private boolean unpaged;
	 private boolean paged;
	public PageableDTO() {
		super();
	}
	public PageableDTO(SortDTO sort, float pageNumber, float pageSize, float offset, boolean unpaged, boolean paged) {
		super();
		this.sort = sort;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.offset = offset;
		this.unpaged = unpaged;
		this.paged = paged;
	}
	public SortDTO getSort() {
		return sort;
	}
	public void setSort(SortDTO sort) {
		this.sort = sort;
	}
	public float getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(float pageNumber) {
		this.pageNumber = pageNumber;
	}
	public float getPageSize() {
		return pageSize;
	}
	public void setPageSize(float pageSize) {
		this.pageSize = pageSize;
	}
	public float getOffset() {
		return offset;
	}
	public void setOffset(float offset) {
		this.offset = offset;
	}
	public boolean isUnpaged() {
		return unpaged;
	}
	public void setUnpaged(boolean unpaged) {
		this.unpaged = unpaged;
	}
	public boolean isPaged() {
		return paged;
	}
	public void setPaged(boolean paged) {
		this.paged = paged;
	}
	 
	 


	 
}
