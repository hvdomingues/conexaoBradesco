package com.bradescoConexoes.demo.dao.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bradescoConexoes.demo.domain.Adress;
import com.bradescoConexoes.demo.dto.AdressDto;

public interface AdressRepository extends PagingAndSortingRepository<AdressDto, Long>{
	
	String HAVERSINE_FORMULA = "(6371 * acos(cos(radians(:latitude)) * cos(radians(s.latitude)) *" +
	        " cos(radians(s.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(s.latitude))))";
	@Query("SELECT s FROM Adress s WHERE " + HAVERSINE_FORMULA + " < :distance ORDER BY "+ HAVERSINE_FORMULA + " DESC")
	Page<Adress> findAdressesWithInDistance(double latitude, double longitude, double distanceWithInKM);
	
	
	
}
