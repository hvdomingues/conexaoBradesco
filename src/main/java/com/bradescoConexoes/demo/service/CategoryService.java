package com.bradescoConexoes.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.bradescoConexoes.demo.dto.CategoryDto;

@Service
public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);

	Page<CategoryDto> getAll(int page, int size);

	CategoryDto updateCategory(CategoryDto categoryDto);

	Boolean deleteCategoryById(Long id);

	CategoryDto getCategoryById(Long id);

}
