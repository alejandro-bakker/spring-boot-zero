package org.alex.videojuegos.controller;

import org.alex.videojuegos.domain.Videojuego;
import org.alex.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

        // Dynamic list: All
        List<Videojuego> destacados = videojuegoService.buscarDestacadosDesdeLaBaseDeDatos();

        // Dynamic list: All ordered
        // List<Videojuego> destacados = videojuegoService.buscarDestacadosDesdeLaBaseDeDatosConJPQL();

        // Dynamic list: By DistributorId
        // List<Videojuego> destacados = videojuegoService.servBuscarDestacadosPorDistribuidorIdConJPQL(1);

        model.addAttribute("videojuegosDestacados", destacados);
        return "listado";
    }

    @RequestMapping("/videojuego-por-distribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model) {
        List<Videojuego> videojuegosPorDistribuidor = videojuegoService.servBuscarDestacadosPorDistribuidorIdConJPQL(distribuidorId);
        model.addAttribute("videojuegosDestacados", videojuegosPorDistribuidor);
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model) {
        List<Videojuego> videojuegosEncontrados = videojuegoService.buscarPorNombre(consulta);
        model.addAttribute("videojuegosDestacados", videojuegosEncontrados);
        return "listado";
    }

}
