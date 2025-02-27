package com.tuempresa.ParqueDiversiones.service;

import com.tuempresa.ParqueDiversiones.model.Parque;
import com.tuempresa.ParqueDiversiones.repository.ParqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParqueServiceImpl implements ParqueService {

    @Autowired
    private ParqueRepository parqueRepository;

    @Override
    public List<Parque> obtenerTodos() {
        return parqueRepository.findAll();
    }

    @Override
    public Parque obtenerPorId(Long id) {
        return parqueRepository.findById(id).orElse(null);
    }

    @Override
    public Parque guardarParque(Parque parque) {
        return parqueRepository.save(parque);
    }

    @Override
    public void eliminarParque(Long id) {
        parqueRepository.deleteById(id);
    }
}
