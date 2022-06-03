package cat.itacademy.barcelonactiva.hackaton.model.services;

import cat.itacademy.barcelonactiva.hackaton.model.domain.Terraza;
import cat.itacademy.barcelonactiva.hackaton.model.dto.TerrazaDTO;
import cat.itacademy.barcelonactiva.hackaton.model.repository.ITerrazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class TerrazaService {

    @Autowired
    ITerrazaRepository repository;


    public ResponseEntity <?> saveTerraza(Terraza terraza) {
        terraza = repository.save(terraza);
        return ResponseEntity.created(URI.create(String.format("/terrazas/%s", terraza.getId()))).build ();
    }

    public ResponseEntity <?> getTerrazas() {
        List<Terraza> terrazas = repository.findAll();
        if (terrazas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza selectedTerraza = doRoulette(terrazas);
        TerrazaDTO returnTerraza = toDto(selectedTerraza);
        return ResponseEntity.ok(returnTerraza);
    }

    public ResponseEntity <?> getTerrazasByBarrio(String nomBarrio) {
        List<Terraza> terrazas = repository.findTerrazasByNomBarrio(nomBarrio);
        if (terrazas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza selectedTerraza = doRoulette(terrazas);
        TerrazaDTO returnTerraza = toDto(selectedTerraza);
        return ResponseEntity.ok(returnTerraza);
    }

    public ResponseEntity <?> getTerrazasByBarrio(Integer codBarrio) {
        List<Terraza> terrazas = repository.findTerrazasByCodBarrio(codBarrio);
        if (terrazas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza selectedTerraza = doRoulette(terrazas);
        TerrazaDTO returnTerraza = toDto(selectedTerraza);
        return ResponseEntity.ok(returnTerraza);
    }

    public ResponseEntity <?> getTerrazasByBarrioYSillas(String nom, Integer sillas) {
        List<Terraza> terrazas = repository.findTerrazasByNomYSillas(nom, sillas);
        if (terrazas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza selectedTerraza = doRoulette(terrazas);
        TerrazaDTO returnTerraza = toDto(selectedTerraza);
        return ResponseEntity.ok(returnTerraza);
    }

    public ResponseEntity <?> getTerrazasByBarrioYSillas(Integer cod, Integer sillas) {
        List<Terraza> terrazas = repository.findTerrazasByCodYSillas(cod, sillas);
        if (terrazas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza selectedTerraza = doRoulette(terrazas);
        TerrazaDTO returnTerraza = toDto(selectedTerraza);
        return ResponseEntity.ok(returnTerraza);
    }

    public ResponseEntity <?> getTerrazasBySillas(Integer sillas) {
        List<Terraza> terrazas = repository.findTerrazasBySillas(sillas);
        if (terrazas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Terraza selectedTerraza = doRoulette(terrazas);
        TerrazaDTO returnTerraza = toDto(selectedTerraza);
        return ResponseEntity.ok(returnTerraza);
    }

    private TerrazaDTO toDto(Terraza selectedTerraza) {
        return new TerrazaDTO(selectedTerraza.getNum_id(), selectedTerraza.getDireccion(),
                selectedTerraza.getNomBarrio(), selectedTerraza.getLat(),
                selectedTerraza.getLon());
    }

    private Terraza doRoulette(List<Terraza> terrazas) {
        Random rnd = new Random();
        int index = rnd.nextInt(0, terrazas.size());
        return terrazas.get(index);
    }
}
