package org.alex.videojuegos.service;

import org.alex.videojuegos.domain.Videojuego;
import org.alex.videojuegos.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacadosDesdeLaBaseDeDatos() {
        return videojuegoRepository.findAll();
    }

    public List<Videojuego> buscarDestacados() {

        List<Videojuego> destacados = new ArrayList<>();

        // 00
        Videojuego juego00 = new Videojuego();
        juego00.setName("Videojuego 00");
        juego00.setDescription("Description 00");
        juego00.setImageUrl("images/00.jpg");
        destacados.add(juego00);

        // 01
        Videojuego juego01 = new Videojuego();
        juego01.setName("Videojuego 01");
        juego01.setDescription("Description 01");
        juego01.setImageUrl("images/01.png");
        destacados.add(juego01);

        // 02
        Videojuego juego02 = new Videojuego();
        juego02.setName("Videojuego 02");
        juego02.setDescription("Description 02");
        juego02.setImageUrl("images/02.webp");
        destacados.add(juego02);

        // 03
        Videojuego juego03 = new Videojuego();
        juego03.setName("Videojuego 03");
        juego03.setDescription("Description 03");
        juego03.setImageUrl("images/03.jpg");
        destacados.add(juego03);

        // 04
        Videojuego juego04 = new Videojuego();
        juego04.setName("Videojuego 04");
        juego04.setDescription("Description 04");
        juego04.setImageUrl("images/04.jpg");
        destacados.add(juego04);

        // 05
        Videojuego juego05 = new Videojuego();
        juego05.setName("Videojuego 05");
        juego05.setDescription("Description 05");
        juego05.setImageUrl("images/05.jpg");
        destacados.add(juego05);

        return destacados;
    }
}
