package com.edutech.inscripciones.repository;

import com.edutech.inscripciones.entity.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {

}
