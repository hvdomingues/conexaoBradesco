package com.bradescoConexoes.demo.dto;

import java.util.List;

import com.bradescoConexoes.demo.domain.AdressDto;

public class LocalMarketDto {

	private Long id;
	
	private String companyName;
	
	private AdressDto adress;

	private CategoryDto category;

	private List<AvaliationDto> avaliations;
	
	

	public LocalMarketDto(Long id, String companyName, AdressDto adress, CategoryDto categoryDto,
			List<AvaliationDto> avaliations) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.adress = adress;
		this.category = categoryDto;
		this.avaliations = avaliations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public AdressDto getAdress() {
		return adress;
	}

	public void setAdress(AdressDto adress) {
		this.adress = adress;
	}

	public CategoryDto getCategoryDto() {
		return category;
	}

	public void setCategoryDto(CategoryDto categoryDto) {
		this.category = categoryDto;
	}

	public List<AvaliationDto> getAvaliations() {
		return avaliations;
	}

	public void setAvaliations(List<AvaliationDto> avaliations) {
		this.avaliations = avaliations;
	}
	
	

}
