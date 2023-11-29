package org.alex.videojuegos.controller;

import org.alex.videojuegos.service.DistribuidorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoJuegoCRUDController {

    public final DistribuidorService distribuidorService;

    public VideoJuegoCRUDController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/videojuego/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        return "formVideoJuego";
    }
}