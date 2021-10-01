package br.com.system.pokedex.core.evolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetEvolutionByIdUsecase {

    @Autowired
    private EvolutionGateway evolutionGateway;

    public List<EvolutionEntity> execute(Integer id) {
        return this.evolutionGateway.getPokemonEvolution(id);
    }
}
