package org.alex.videojuegos.controller;

import org.alex.videojuegos.domain.Videojuego;
import org.alex.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model) {

        // Static list
        // List<Videojuego> destacados = videojuegoService.buscarDestacados();

        // Dynamic list
        List<Videojuego> destacados = videojuegoService.buscarDestacadosDesdeLaBaseDeDatos();

        model.addAttribute("videojuegosDestacados", destacados);
        return "listado";
    }
}
