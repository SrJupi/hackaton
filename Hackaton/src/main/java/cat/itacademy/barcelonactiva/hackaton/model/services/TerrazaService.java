package cat.itacademy.barcelonactiva.hackaton.model.services;

import cat.itacademy.barcelonactiva.hackaton.model.domain.Terraza;
import cat.itacademy.barcelonactiva.hackaton.model.repository.ITerrazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class TerrazaService {

    @Autowired
    ITerrazaRepository repository;


    public ResponseEntity saveTerraza(Terraza terraza) {
        terraza = repository.save(terraza);
        return ResponseEntity.created(URI.create(String.format("/terrazas/%s", terraza.getId()))).build ();
    }

    public ResponseEntity getTerrazas() {
        List<Terraza> terrazas = repository.findAll();
        return ResponseEntity.ok(terrazas);
    }

    public ResponseEntity getTerrazasByNomBarrio(String nomBarrio) {
        List<Terraza> terrazas = repository.findTerrazasByNomBarrio(nomBarrio);
        return ResponseEntity.ok(terrazas);
    }

    public ResponseEntity getTerrazasByNomYSillas(String nom, Integer sillas) {
        List<Terraza> terrazas = repository.findTerrazasByNomYSillas(nom, sillas);
        return ResponseEntity.ok(terrazas);
    }

    public ResponseEntity addLikes(String id) {
        Optional<Terraza> optionalTerraza = repository.findById(id);
        if (optionalTerraza.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza terraza = optionalTerraza.get();
        terraza.setLikes(terraza.getLikes() + 1);
        repository.save(terraza);
        return ResponseEntity.ok().build();
    }
}
