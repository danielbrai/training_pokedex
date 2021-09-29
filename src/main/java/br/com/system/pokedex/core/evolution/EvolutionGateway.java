package br.com.system.pokedex.core.evolution;

import java.util.List;

public interface EvolutionGateway {

    public List<EvolutionEntity> getPokemonEvolution(Integer id);

}
