package com.levi.util;

import com.levi.dto.request.PersonRequestDTO;
import com.levi.dto.response.PersonResponseDTO;
import com.levi.models.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {

    public Person toPerson(PersonRequestDTO personDTO) {
        return Person.builder()
                .name(personDTO.getName())
                .cpf(personDTO.getCpf())
                .age(personDTO.getAge())
                .build();
    }

    //now, entity to DTO

    public PersonResponseDTO toPersonDTO(Person person) {
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList) {
        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    } //convert a list people entity to a people list dto

    public void updatePersonData(Person person, PersonRequestDTO personDTO) {
        person.setName(personDTO.getName());
        person.setCpf(personDTO.getCpf());
        person.setAge(personDTO.getAge());
    }
}
