package com.bradescoConexoes.api.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bradescoConexoes.demo.dto.CategoryDto;
import com.bradescoConexoes.demo.service.CategoryService;

@RestController
@RequestMapping(value = "/api/localmarket/category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {

	
	@Autowired
	private CategoryService categoryService;

	// Insert method
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {

		CategoryDto createdLocalMarket = categoryService.createCategory(categoryDto);

		return new ResponseEntity<CategoryDto>(createdLocalMarket, HttpStatus.CREATED);
	}

	// Select all
	@GetMapping(value = "")
	public ResponseEntity<Page<CategoryDto>> getAll(@RequestParam( value = "page", required = false, defaultValue = "0") int page,
		    @RequestParam (value = "size", required = false, defaultValue = "10") int size) {

		Page<CategoryDto> categoriesFound = categoryService.getAll(page, size);

		return new ResponseEntity<Page<CategoryDto>>(categoriesFound, HttpStatus.CREATED);

	}

	// Update method
	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto, HttpServletRequest request,
			HttpServletResponse response) {

		CategoryDto categoryUpdated = categoryService.updateCategory(categoryDto);

		return new ResponseEntity<CategoryDto>(categoryUpdated, HttpStatus.OK);

	}

	// Soft delete method
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteCategory(@RequestParam(required = true) Long id) {

		Boolean isDeleted = categoryService.deleteCategoryById(id);

		return new ResponseEntity<Boolean>(isDeleted, HttpStatus.OK);

	}

	@GetMapping(value = "")
	public ResponseEntity<CategoryDto> getCategoryById(@RequestParam(required = true) Long id) {

		CategoryDto categoryUpdated = categoryService.getCategoryById(id);

		return ResponseEntity.ok().body(categoryUpdated);

	}

}
