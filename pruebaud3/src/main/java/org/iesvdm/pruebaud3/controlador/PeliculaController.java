package org.iesvdm.pruebaud3.controlador;

import org.iesvdm.pruebaud3.modelo.Pelicula;
import org.iesvdm.pruebaud3.service.PeliculaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
@Controller
public class PeliculaController {
    private PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService){this.peliculaService = peliculaService;}

    @GetMapping("/peliculas")
    public String listar(Model model) {

        List<Pelicula> listaPeliculas =  peliculaService.listAll();
        model.addAttribute("listaPeliculas", listaPeliculas);

        return "peliculas";
    }

    @GetMapping("/peliculas/crear")
    public String crear(Model model) {

        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);

        return "crear-pelicula";

    }

    @PostMapping("/peliculas/crear")
    public RedirectView submitCrear(@ModelAttribute("pelicula") Pelicula pelicula) {

        peliculaService.newPelicula(pelicula);

        return new RedirectView("/peliculas") ;

    }
}
