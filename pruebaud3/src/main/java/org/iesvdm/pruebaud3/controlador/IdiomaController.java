package org.iesvdm.pruebaud3.controlador;

import org.iesvdm.pruebaud3.modelo.Idioma;
import org.iesvdm.pruebaud3.modelo.Pelicula;
import org.iesvdm.pruebaud3.service.IdiomaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IdiomaController {

    private IdiomaService idiomaService;

    public IdiomaController(IdiomaService idiomaService) {this.idiomaService = idiomaService;}

    /*@GetMapping("/Idiomas/{id}")
    public String detalle(Model model, @PathVariable Integer id ) {

        Idioma idioma = IdiomaService.one(id);
        model.addAttribute("idioma", idioma);

        return "detalle-idioma";

    }*/
}
