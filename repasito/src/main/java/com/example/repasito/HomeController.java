package com.example.repasito;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value = {""})
public class HomeController {

    @GetMapping(value = {""})
    public String metodo1(){
        return "index";
    }

    @PostMapping(value = {"/imagenes"})
    @ResponseBody
    public String metodo2(@RequestParam("numerofilas") int numFilas,
                          @RequestParam("numerocolumnas") int numColumnas,
                          @RequestParam("posicionesIniciales") String posicionesIniciales,
                          @RequestParam("numerofotos") int numeroFotos){

        String[] listaPosiciones = posicionesIniciales.split(" "); //separamos las posciones iniciales en una lista

        //En base a numFilas y numColumnas generamos el espacio:

        ArrayList<String> tablaTotal = new ArrayList<>();





        return "se muestra la siguiente lista de posiciones:" + listaPosiciones[0];
    }

}
