package org.objectmapper.createarrayjsonfile;

import java.util.ArrayList;

public class PojoClassForCreatingJsonStructure {

	
	    private int page;
	    private int per_page;
	    private int total;
	    private int total_pages;
	    private ArrayList<PojoClassForArray> data;
	    
	    //constructor parameterized
		public PojoClassForCreatingJsonStructure(int page, int per_page, int total, int total_pages,
				ArrayList<PojoClassForArray> data) {
			super();
			this.page = page;
			this.per_page = per_page;
			this.total = total;
			this.total_pages = total_pages;
			this.data = data;
		}
		
		//getter and setter
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getPer_page() {
			return per_page;
		}
		public void setPer_page(int per_page) {
			this.per_page = per_page;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getTotal_pages() {
			return total_pages;
		}
		public void setTotal_pages(int total_pages) {
			this.total_pages = total_pages;
		}
		public ArrayList<PojoClassForArray> getData() {
			return data;
		}
		public void setData(ArrayList<PojoClassForArray> data) {
			this.data = data;
		}
	
	
	
}
