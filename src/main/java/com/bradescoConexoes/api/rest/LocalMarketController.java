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

import com.bradescoConexoes.demo.dto.AdressDto;
import com.bradescoConexoes.demo.dto.LocalMarketDto;
import com.bradescoConexoes.demo.service.LocalMarketService;


@RestController
@RequestMapping(value = "/api/localmarket")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LocalMarketController {

	@Autowired
	private LocalMarketService localMarketService;

	// Insert method
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity<LocalMarketDto> createLocalMarket(@RequestBody LocalMarketDto localMarketDto) {

		LocalMarketDto createdLocalMarket = localMarketService.createLocalMarket(localMarketDto);

		return new ResponseEntity<LocalMarketDto>(createdLocalMarket, HttpStatus.CREATED);
	}

	// Select all by cep method
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = { "application/json",
	"application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity<Page<LocalMarketDto>> getAllByAdress(@RequestParam( value = "page", required = false, defaultValue = "0") int page,
		    @RequestParam (value = "size", required = false, defaultValue = "10") int size, @RequestParam(value = "radius", required = false, defaultValue = "3") int radius, @RequestBody(required = true) AdressDto adressDto) {

		Page<LocalMarketDto> localMarketsFound = localMarketService.getAllByAdress(page, size, adressDto, radius);

		return new ResponseEntity<Page<LocalMarketDto>>(localMarketsFound, HttpStatus.CREATED);

	}

	// Update method
	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity<LocalMarketDto> updateLocalMarket(@RequestBody LocalMarketDto LocalMarketDto, HttpServletRequest request,
			HttpServletResponse response) {

		LocalMarketDto localMarketUpdated = localMarketService.updateLocalMarket(LocalMarketDto);

		return new ResponseEntity<LocalMarketDto>(localMarketUpdated, HttpStatus.OK);

	}


	@GetMapping(value = "")
	public ResponseEntity<LocalMarketDto> getLocalMarketById(@RequestParam(required = true) Long id) {

		LocalMarketDto foundLocalMarket = localMarketService.getLocalMarketById(id);

		return ResponseEntity.ok().body(foundLocalMarket);

	}

	

	
}
