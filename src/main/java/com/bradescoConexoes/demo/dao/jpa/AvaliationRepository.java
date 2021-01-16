package com.bradescoConexoes.demo.dao.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bradescoConexoes.demo.domain.Avaliation;

public interface AvaliationRepository extends PagingAndSortingRepository<Avaliation, Long>{
	
}
