package org.alex.videojuegos.repository;

import org.alex.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {

    @Query("from Videojuego v order by v.name DESC LIMIT 5")
    List<Videojuego> buscarTodosConJPQL();

}
