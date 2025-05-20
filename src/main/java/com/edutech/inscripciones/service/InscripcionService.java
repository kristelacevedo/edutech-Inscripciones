package com.edutech.inscripciones.service;

import com.edutech.inscripciones.model.Inscripcion;
import com.edutech.inscripciones.repository.InscripcionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscripcionService {

    private final InscripcionRepository repo;

    public InscripcionService(InscripcionRepository repo) {
        this.repo = repo;
    }
    public List<Inscripcion> Listar(){
        return repo.findAll();
    }
    public Inscripcion crear(Inscripcion i){
        return repo.save(i);
    }
    public Optional<Inscripcion> obtener (Long id){
        return repo.findById(id);
    }
    public void eliminar (Long id){
        repo.deleteById(id);
    }
}
