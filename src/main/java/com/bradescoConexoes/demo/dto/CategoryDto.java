package com.bradescoConexoes.demo.dto;

import java.util.List;

public class CategoryDto {
	
	

	private Long id;
	

	private String categoryName;

	private List<LocalMarketDto> localMarkets;

	public CategoryDto(Long id, String categoryName, List<LocalMarketDto> localMarkets) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.localMarkets = localMarkets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<LocalMarketDto> getLocalMarkets() {
		return localMarkets;
	}

	public void setLocalMarkets(List<LocalMarketDto> localMarkets) {
		this.localMarkets = localMarkets;
	}
	
	


}
