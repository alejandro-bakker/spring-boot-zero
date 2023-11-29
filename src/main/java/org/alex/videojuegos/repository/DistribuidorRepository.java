package org.alex.videojuegos.repository;

import org.alex.videojuegos.domain.Distribuidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {

}
