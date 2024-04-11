package com.example.repasito;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/juego"})
public class HomeController {

    @GetMapping(value = {""})
    public String metodo1(){
        return "index";
    }

    @PostMapping(value = {"/imagenes"})
    public String metodo2(@RequestParam("numerofilas") int numFilas,
                          @RequestParam("numerocolumnas") int numColumnas,
                          @RequestParam("posicionesIniciales") String posicionesIniciales,
                          @RequestParam("numerofotos") int numeroFotos){

        
        return "imagenes";
    }

}
