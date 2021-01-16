package com.bradescoConexoes.demo.dao.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bradescoConexoes.demo.domain.AdressDto;

public interface AdressRepository extends PagingAndSortingRepository<AdressDto, Long>{
	
	
	
}
