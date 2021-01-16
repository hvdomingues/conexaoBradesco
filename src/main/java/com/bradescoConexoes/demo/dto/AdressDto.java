package com.bradescoConexoes.demo.dto;

public class AdressDto {

	private Long id;

	private String state;

	private String city;

	private String neighborhood;
	private String street;
	private String number;
	private String aditionalAdressData;
	private LocalMarketDto localMarketDto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAditionalAdressData() {
		return aditionalAdressData;
	}
	public void setAditionalAdressData(String aditionalAdressData) {
		this.aditionalAdressData = aditionalAdressData;
	}
	public LocalMarketDto getLocalMarketDto() {
		return localMarketDto;
	}
	public void setLocalMarketDto(LocalMarketDto localMarketDto) {
		this.localMarketDto = localMarketDto;
	}
	
	
	

}
