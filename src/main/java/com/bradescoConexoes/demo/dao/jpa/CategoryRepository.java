package com.bradescoConexoes.demo.dao.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bradescoConexoes.demo.domain.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long>{

}
