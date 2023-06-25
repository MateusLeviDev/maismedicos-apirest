package com.levi.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    //passa dois tipos de objetos. o tipo da entity que o repo vai trabalhar e o 2 o tipo de atributo PK

    Page<Medico> findAllByAtivoTrue(Pageable pageable);
}
