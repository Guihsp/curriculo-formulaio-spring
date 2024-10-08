package br.edu.senac.curriculo.controller;

import br.edu.senac.curriculo.model.Curriculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class CurriculoController {

    @GetMapping("/curriculo")
    public String showForm(Model model) {
        Curriculo curriculo = new Curriculo();

        model.addAttribute("curriculo", curriculo);
        return "curriculo-form";
    }

    @PostMapping("/curriculo")
    public String submitCurriculo(@ModelAttribute("curriculo") Curriculo curriculo, Model model) {

        if (curriculo.getTecnologias() == null) {
            curriculo.setTecnologias(new ArrayList<>());
        }
        if (curriculo.getFormacoes() == null) {
            curriculo.setFormacoes(new ArrayList<>());
        }
        if (curriculo.getExperiencias() == null) {
            curriculo.setExperiencias(new ArrayList<>());
        }
        if (curriculo.getIdiomas() == null) {
            curriculo.setIdiomas(new ArrayList<>());
        }

        model.addAttribute("curriculo", curriculo);
        return "curriculo-view";
    }
}
