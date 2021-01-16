package com.bradescoConexoes.demo.serviceImpl;

import org.springframework.data.domain.Page;

import com.bradescoConexoes.demo.domain.Adress;
import com.bradescoConexoes.demo.domain.LocalMarket;
import com.bradescoConexoes.demo.dto.AdressDto;
import com.bradescoConexoes.demo.service.AdressService;

public class AdressServiceImpl implements AdressService {

	@Override
	public Adress dtoToEntity(AdressDto adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adress createAdress(Adress adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attachToLocalMarket(LocalMarket saved) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdressDto entityToDto(Adress adress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Adress> findAdressesWithInDistance(AdressDto adressDto, double radius) {
		// TODO Auto-generated method stub
		return null;
	}

}
