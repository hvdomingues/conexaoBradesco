package com.bradescoConexoes.demo.dto;

public class AvaliationDto {
	

	private Long id;
	
	private Integer avaliationStars;
	
	private Boolean isStillRuning;
	
	private LocalMarketDto localMarket;

	public AvaliationDto(Long id, Integer avaliationStars, Boolean isStillRuning, LocalMarketDto localMarket) {
		super();
		this.id = id;
		this.avaliationStars = avaliationStars;
		this.isStillRuning = isStillRuning;
		this.localMarket = localMarket;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAvaliationStars() {
		return avaliationStars;
	}

	public void setAvaliationStars(Integer avaliationStars) {
		this.avaliationStars = avaliationStars;
	}

	public Boolean getIsStillRuning() {
		return isStillRuning;
	}

	public void setIsStillRuning(Boolean isStillRuning) {
		this.isStillRuning = isStillRuning;
	}

	public LocalMarketDto getLocalMarket() {
		return localMarket;
	}

	public void setLocalMarket(LocalMarketDto localMarket) {
		this.localMarket = localMarket;
	}
	
	
	

}
