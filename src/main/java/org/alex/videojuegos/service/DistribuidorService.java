package org.alex.videojuegos.service;

import org.alex.videojuegos.domain.Distribuidor;
import org.alex.videojuegos.repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorService {

    // Dependency injection
    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    // Methods
    public List<Distribuidor> buscarTodos() {
        return distribuidorRepository.findAll();
    }

}