package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Voo;
import br.edu.ifto.sistemacompanhiaaerea.model.CompanhiaAerea;
import br.edu.ifto.sistemacompanhiaaerea.model.Aeroporto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource (collectionResourceRel ="Voo",path = "Voo")
public interface VooRepository extends PagingAndSortingRepository <Voo , Long> {
  
    Voo findByVooId(@Param("id") Long id);
    Optional <Voo> findBynumero(@Param("numero") String numero);


   List <Aeroporto> findByaeroportoOrigem (@Param("aeroportoOrigem")Long aeroportoOrigem);

    List <Aeroporto> findByaeroportoDestino(@Param("aeroportoDestino")Long aeroportoDestino);

    List<CompanhiaAerea> findBynome(@Param("nome") String nome);



}
