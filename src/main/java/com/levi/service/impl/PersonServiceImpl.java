package com.levi.service.impl;

import com.levi.dto.request.PersonRequestDTO;
import com.levi.dto.response.PersonResponseDTO;
import com.levi.models.Person;
import com.levi.repository.PersonRepository;
import com.levi.service.PersonService;
import com.levi.util.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository; //inject person repository
    private final PersonMapper personMapper; //alternative model mapper

    @Override
    public PersonResponseDTO findById(Long id) {
        return personMapper.toPersonDTO(returnPerson(id));
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return personMapper.toPeopleDTO(personRepository.findAll());
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personDTO) {
        Person person = personMapper.toPerson(personDTO);
        return personMapper.toPersonDTO(personRepository.save(person));
    }

    @Override
    public PersonResponseDTO update( Long id, PersonRequestDTO personDTO) {
        Person person = returnPerson(id);
        personMapper.updatePersonData(person, personDTO);
        return personMapper.toPersonDTO(personRepository.save(person));
    }

    @Override
    public String delete(Long id) {
        personRepository.deleteById(id);
        return "Person ID"+id+"removed";
    }

    private Person returnPerson(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found!"));
    }
}
