package cat.itacademy.barcelonactiva.hackaton.model.repository;

import cat.itacademy.barcelonactiva.hackaton.model.domain.Terraza;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITerrazaRepository extends MongoRepository<Terraza, String> {

    @Query("{'nomBarrio': ?0}")
    List<Terraza> findTerrazasByNomBarrio(String nomBarrio);

    @Query("{'codBarrio': ?0}")
    List<Terraza> findTerrazasByCodBarrio(Integer codBarrio);

    @Query("{'nomBarrio': ?0, 'sillas' : {$gte : ?1}}")
    List<Terraza> findTerrazasByNomYSillas(String nomBarrio, Integer sillas);

    @Query("{'codBarrio': ?0, 'sillas' : {$gte : ?1}}")
    List<Terraza> findTerrazasByCodYSillas(Integer codBarrio, Integer sillas);

    @Query("{'sillas' : {$gte : ?0}}")
    List<Terraza> findTerrazasBySillas(Integer sillas);
}
