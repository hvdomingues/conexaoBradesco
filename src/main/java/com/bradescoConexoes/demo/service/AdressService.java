package com.bradescoConexoes.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.bradescoConexoes.demo.domain.Adress;
import com.bradescoConexoes.demo.domain.LocalMarket;
import com.bradescoConexoes.demo.dto.AdressDto;

@Service
public interface AdressService {

	Adress dtoToEntity(AdressDto adress);

	Adress createAdress(Adress adress);

	void attachToLocalMarket(LocalMarket saved);

	AdressDto entityToDto(Adress adress);

	Page<Adress> findAdressesWithInDistance(AdressDto adressDto, double radius);

	
	
	
	
}
