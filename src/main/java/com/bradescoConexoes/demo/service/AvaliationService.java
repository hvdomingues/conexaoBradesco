package com.bradescoConexoes.demo.service;

import org.springframework.stereotype.Service;

import com.bradescoConexoes.demo.domain.Avaliation;
import com.bradescoConexoes.demo.dto.AvaliationDto;

@Service
public interface AvaliationService {

	AvaliationDto entityToDto(Avaliation avaliation);

}
