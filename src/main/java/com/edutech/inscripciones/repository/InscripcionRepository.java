package com.edutech.inscripciones.repository;

import com.edutech.inscripciones.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {

}
