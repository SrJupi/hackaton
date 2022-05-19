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

    @GetMapping("/terrazas")
    ResponseEntity getTerrazas(){
        return service.getTerrazas();
    }

    @GetMapping(value = "/terrazas", params = {"nom", "sillas"})
    ResponseEntity getTerrazasFilter(@RequestParam(required = true) String nom, @RequestParam(required = true) Integer sillas){
        return service.getTerrazasByNomYSillas(nom, sillas);
    }

    @GetMapping(value = "/terrazas", params = "nom")
    ResponseEntity getTerrazasByNom(@RequestParam String nom){
        return service.getTerrazasByNomBarrio(nom);
    }

    @PutMapping(value = "/terrazas", params = "id")
    ResponseEntity addLikes(@RequestParam String id){
        return service.addLikes(id);
    }

    @PostMapping("/terrazas")
    ResponseEntity newTerraza(@RequestBody Terraza terraza){
        return service.saveTerraza(terraza);
    }
}
