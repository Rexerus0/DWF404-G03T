package com.tuempresa.ParqueDiversiones.controller;

import com.tuempresa.ParqueDiversiones.model.Parque;
import com.tuempresa.ParqueDiversiones.service.ParqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parques")
public class ParqueController {

    @Autowired
    private ParqueService parqueService;

    @GetMapping
    public List<Parque> obtenerTodos() {
        return parqueService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Parque obtenerPorId(@PathVariable Long id) {
        return parqueService.obtenerPorId(id);
    }

    @PostMapping
    public Parque guardarParque(@RequestBody Parque parque) {
        return parqueService.guardarParque(parque);
    }

    @DeleteMapping("/{id}")
    public void eliminarParque(@PathVariable Long id) {
        parqueService.eliminarParque(id);
    }
}
