package br.com.plantaofacil.repository;


import br.com.plantaofacil.entity.Plantao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PlantaoRepository extends CrudRepository<Plantao, Long> {
    List<Plantao> findAllByOrderByNomeDaLojaAscIdDesc();
}