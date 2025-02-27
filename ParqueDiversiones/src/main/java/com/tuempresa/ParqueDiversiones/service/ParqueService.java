package com.tuempresa.ParqueDiversiones.service;

import com.tuempresa.ParqueDiversiones.model.Parque;
import java.util.List;

public interface ParqueService {
    List<Parque> obtenerTodos();
    Parque obtenerPorId(Long id);
    Parque guardarParque(Parque parque);
    void eliminarParque(Long id);
}
