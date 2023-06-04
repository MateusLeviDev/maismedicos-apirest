package com.levi.service;

import com.levi.dto.response.PersonResponseDTO;
import com.levi.dto.request.PersonRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(PersonRequestDTO personDTO);

    String delete(Long id);
}
