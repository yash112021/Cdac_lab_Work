package com.demo.categorywebservice1.dto;

import java.util.List;

import com.demo.categorywebservice1.beans.Category;



public class CategoryDto {
	
	// now we are going to create this so one webservice can send request to the another one
	
	// data Member of the Category DTO
	Category cat;
	List<ProductDto> plist;
	
	
	
	public CategoryDto() {
		super();
	}



	// parmaterised constructor
		public CategoryDto(Category cat, List<ProductDto> plist) {
			super();
			this.cat = cat;
			this.plist = plist;
		}



		public Category getCat() {
			return cat;
		}



		public void setCat(Category cat) {
			this.cat = cat;
		}



		public List<ProductDto> getPlist() {
			return plist;
		}



		public void setPlist(List<ProductDto> plist) {
			this.plist = plist;
		}



		@Override
		public String toString() {
			return "CategoryDto [cat=" + cat + ", plist=" + plist + "]";
		}
	
	
	
	
	
	
}
