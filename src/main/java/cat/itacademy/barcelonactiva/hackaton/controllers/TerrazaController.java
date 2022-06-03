package cat.itacademy.barcelonactiva.hackaton.controllers;

import cat.itacademy.barcelonactiva.hackaton.model.domain.Terraza;
import cat.itacademy.barcelonactiva.hackaton.model.services.TerrazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TerrazaController {

    @Autowired
    TerrazaService service;

    @GetMapping()
    ResponseEntity <?> getTerrazas(){
        return service.getTerrazas();
    }

    @GetMapping(params = {"nom", "sillas"})
    ResponseEntity <?> getTerrazasFilter(@RequestParam() String nom,
                                     @RequestParam() Integer sillas){
        return service.getTerrazasByBarrioYSillas(nom, sillas);
    }

    @GetMapping(params = {"cod", "sillas"})
    ResponseEntity<?> getTerrazasFilter(@RequestParam() Integer cod,
                                     @RequestParam() Integer sillas){
        return service.getTerrazasByBarrioYSillas(cod, sillas);
    }

    @GetMapping(params = {"sillas"})
    ResponseEntity <?> getTerrazasFilter(@RequestParam() Integer sillas){
        return service.getTerrazasBySillas(sillas);
    }

    @GetMapping(params = "nom")
    ResponseEntity <?> getTerrazasByNom(@RequestParam String nom){
        return service.getTerrazasByBarrio(nom);
    }

    @GetMapping(params = "cod")
    ResponseEntity <?> getTerrazasByNom(@RequestParam Integer cod){
        return service.getTerrazasByBarrio(cod);
    }

    @PostMapping()
    ResponseEntity <?> newTerraza(@RequestBody Terraza terraza){
        return service.saveTerraza(terraza);
    }
}
