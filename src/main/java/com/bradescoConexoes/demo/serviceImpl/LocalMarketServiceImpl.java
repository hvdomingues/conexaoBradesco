package com.bradescoConexoes.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.bradescoConexoes.demo.dao.jpa.LocalMarketRepository;
import com.bradescoConexoes.demo.domain.Adress;
import com.bradescoConexoes.demo.domain.Avaliation;
import com.bradescoConexoes.demo.domain.Category;
import com.bradescoConexoes.demo.domain.LocalMarket;
import com.bradescoConexoes.demo.dto.AdressDto;
import com.bradescoConexoes.demo.dto.AvaliationDto;
import com.bradescoConexoes.demo.dto.CategoryDto;
import com.bradescoConexoes.demo.dto.LocalMarketDto;
import com.bradescoConexoes.demo.exception.NotFoundException;
import com.bradescoConexoes.demo.service.AdressService;
import com.bradescoConexoes.demo.service.AvaliationService;
import com.bradescoConexoes.demo.service.LocalMarketService;

@Service
public class LocalMarketServiceImpl implements LocalMarketService{
	
	@Autowired
	AdressService adressService;
	
	@Autowired
	AvaliationService avaliationService;
	
	@Autowired
	LocalMarketRepository localMarketRepository;

	@Override
	public LocalMarketDto createLocalMarket(LocalMarketDto localMarketDto) {
		
		LocalMarket toSave = dtoToEntity(localMarketDto);
		
		if(isValidated(toSave)) {
			
			toSave.setAdress(adressService.createAdress(toSave.getAdress()));
			
			LocalMarket saved = localMarketRepository.save(toSave);
			
			adressService.attachToLocalMarket(saved);
			
			LocalMarketDto toReturn = entityToDto(saved);
			
			return toReturn;
			
		}
		
		
		return null;
	}

	@Override
	public LocalMarketDto getLocalMarketById(Long id) {
		
		LocalMarketDto foundLocalMarketDto = new LocalMarketDto();
		
		Optional<LocalMarket> foundLocalMarket = localMarketRepository.findById(id);
		
		if(foundLocalMarket.isPresent()) {
			foundLocalMarketDto = entityToDto(foundLocalMarket.get());
			
			return foundLocalMarketDto;
		}else {
			throw new NotFoundException("O comércio local com ID informado não foi encontrado");
		}
		
		
	}


	@Override
	public LocalMarketDto updateLocalMarket(LocalMarketDto localMarketDto) {
		// TODO update logic
		return null;
	}

	@Override
	public Page<LocalMarketDto> getAllByAdress(int page, int size, AdressDto adressDto, double radius) {
		
		Page<Adress> foundAdresses = adressService.findAdressesWithInDistance(adressDto, radius);
		
		//TODO create page LocalMarketDto logic
		
		return null;
	}
	
	public LocalMarket dtoToEntity(LocalMarketDto localMarketDto) {
		
		LocalMarket localMarket = new LocalMarket();
		
		if(localMarketDto.getCompanyName() != null) {
			localMarket.setCompanyName(localMarketDto.getCompanyName());
		}
		
		if(localMarketDto.getAdress() != null) {
			Adress adress = adressService.dtoToEntity(localMarketDto.getAdress());
			localMarket.setAdress(adress);
		}
		
		if(localMarketDto.getCategoryDto() != null) {
			Category category = new Category();
			category.setId(localMarketDto.getCategoryDto().getId());
		}
		
		return localMarket;
		
		
	}
	
	public LocalMarketDto entityToDto(LocalMarket localMarket) {
		
		LocalMarketDto localMarketDto = new LocalMarketDto();
		
		if(localMarket.getId() != null) {
			localMarketDto.setId(localMarket.getId());
		}
		
		if(localMarket.getCompanyName() != null) {
			localMarketDto.setCompanyName(localMarket.getCompanyName());
		}
		
		if(localMarket.getAdress() != null) {
			localMarketDto.setAdress(adressService.entityToDto(localMarket.getAdress()));
		}
		
		if(localMarket.getCategory() != null) {
			CategoryDto categoryDto = new CategoryDto();
			
			categoryDto.setId(localMarket.getCategory().getId());
			categoryDto.setCategoryName(localMarket.getCategory().getCategoryName());
			
			localMarketDto.setCategoryDto(categoryDto);
		}
		
		if(localMarket.getAvaliations() != null) {
			
			List<AvaliationDto> avaliationsDto = new ArrayList<AvaliationDto>();
			
			for (Avaliation avaliation : localMarket.getAvaliations()) {
				
				avaliationsDto.add(avaliationService.entityToDto(avaliation));
				
				
			}
			
			localMarketDto.setAvaliations(avaliationsDto);
			
		}
		
		return localMarketDto;
	}

	
	private boolean isValidated(LocalMarket toSave) {
		// TODO Lógica de validação para salvar o comércio local
		return true;
	}


}
