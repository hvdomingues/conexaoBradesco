package com.bradescoConexoes.demo.dto;

import java.util.List;

import com.bradescoConexoes.demo.domain.Adress;
import com.bradescoConexoes.demo.domain.AvaliationDto;

public class LocalMarketDto {

	private Long id;
	
	private String companyName;
	
	private Adress adress;

	private CategoryDto categoryDto;

	private List<AvaliationDto> avaliations;
	
	

	public LocalMarketDto(Long id, String companyName, Adress adress, CategoryDto categoryDto,
			List<AvaliationDto> avaliations) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.adress = adress;
		this.categoryDto = categoryDto;
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public CategoryDto getCategoryDto() {
		return categoryDto;
	}

	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}

	public List<AvaliationDto> getAvaliations() {
		return avaliations;
	}

	public void setAvaliations(List<AvaliationDto> avaliations) {
		this.avaliations = avaliations;
	}
	
	

}
