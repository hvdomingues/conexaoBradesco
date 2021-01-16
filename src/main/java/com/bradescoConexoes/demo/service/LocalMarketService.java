package com.bradescoConexoes.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.bradescoConexoes.demo.domain.LocalMarket;
import com.bradescoConexoes.demo.dto.AdressDto;
import com.bradescoConexoes.demo.dto.LocalMarketDto;

@Service
public interface LocalMarketService {

	LocalMarketDto createLocalMarket(LocalMarketDto localMarketDto);

	LocalMarketDto getLocalMarketById(Long id);

	LocalMarketDto updateLocalMarket(LocalMarketDto localMarketDto);

	Page<LocalMarketDto> getAllByAdress(int page, int size, AdressDto adressDto, double radius);

	LocalMarketDto entityToDto(LocalMarket localMarket);
	
	

}
