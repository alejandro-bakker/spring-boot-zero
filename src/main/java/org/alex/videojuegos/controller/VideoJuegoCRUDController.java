package org.alex.videojuegos.controller;

import org.alex.videojuegos.domain.Videojuego;
import org.alex.videojuegos.service.DistribuidorService;
import org.alex.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoJuegoCRUDController {

    public final DistribuidorService distribuidorService;
    public final VideojuegoService videojuegoService;

    public VideoJuegoCRUDController(DistribuidorService distribuidorService, VideojuegoService videojuegoService) {
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/videojuego/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formVideoJuego";
    }

    @PostMapping("/videojuego/guardar")
    public String guardar(Videojuego videojuego) {
        videojuegoService.guardar(videojuego);
        return "redirect:/";
    }
}