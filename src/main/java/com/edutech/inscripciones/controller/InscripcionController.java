package com.edutech.inscripciones.controller;

import com.edutech.inscripciones.entity.Inscripcion;
import com.edutech.inscripciones.service.InscripcionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    private final InscripcionService service;
    public InscripcionController(InscripcionService service) {
        this.service = service;
    }
    @GetMapping
    public List<Inscripcion> Listar(){
        return service.Listar();
    }
    @PostMapping
    public Inscripcion crear(@RequestBody Inscripcion i ){
        return service.crear(i);
    }
    @GetMapping("/{id}")
    public Inscripcion obtener (@PathVariable Long id){
        return service.obtener(id).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable Long id){
        service.eliminar(id);
    }

}
