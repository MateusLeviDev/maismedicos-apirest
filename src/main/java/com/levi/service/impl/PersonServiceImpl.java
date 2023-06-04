package com.levi.service.impl;

import com.levi.dto.request.PersonRequestDTO;
import com.levi.dto.response.PersonResponseDTO;
import com.levi.repository.PersonRepository;
import com.levi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public PersonResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return null;
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personDTO) {
        return null;
    }

    @Override
    public PersonResponseDTO update(PersonRequestDTO personDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
