package com.bradescoConexoes.demo.dao.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bradescoConexoes.demo.domain.LocalMarket;

public interface LocalMarketRepository extends PagingAndSortingRepository<LocalMarket, Long>{

}
