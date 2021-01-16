package com.bradescoConexoes.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import com.bradescoConexoes.demo.dao.jpa.CategoryRepository;
import com.bradescoConexoes.demo.domain.Category;
import com.bradescoConexoes.demo.domain.LocalMarket;
import com.bradescoConexoes.demo.dto.CategoryDto;
import com.bradescoConexoes.demo.dto.LocalMarketDto;
import com.bradescoConexoes.demo.service.CategoryService;
import com.bradescoConexoes.demo.service.LocalMarketService;

public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	LocalMarketService localMarketService;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CategoryDto> getAll(int page, int size) {
		
		PageRequest pageRequest = PageRequest.of(page, size);
		
		Page<Category> foundPages = categoryRepository.findAll(pageRequest);
		
		
		
		List<CategoryDto> categoriesDto = new ArrayList<CategoryDto>();
				
		for (Category category : foundPages) {
			categoriesDto.add(entityToDto(category));
		}
		
		Page<CategoryDto> foundPagesDto = new PageImpl<>(categoriesDto);
		
		return foundPagesDto;
	}


	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryDto getCategoryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	private CategoryDto entityToDto(Category category) {
		CategoryDto categoryDto = new CategoryDto();
		
		categoryDto.setId(category.getId());
		categoryDto.setCategoryName(category.getCategoryName());
		
		List<LocalMarketDto> localMarkets = new ArrayList<LocalMarketDto>();
		
		for (LocalMarket localMarket : category.getLocalMarkets()) {
			
			localMarkets.add(localMarketService.entityToDto(localMarket));
			
		}
		
		categoryDto.setLocalMarkets(localMarkets);
		
		return categoryDto;
	}

}
