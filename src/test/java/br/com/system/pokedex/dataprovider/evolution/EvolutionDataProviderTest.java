package br.com.system.pokedex.dataprovider.evolution;

import br.com.system.pokedex.core.evolution.EvolutionEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

class EvolutionDataProviderTest {
    private EvolutionDataProvider dataProvider;

    @Test
    public void deveRetornarAsEvolucoes() {
//        EvolutionDataProvider evolutionDataProvider;
        List<EvolutionEntity> bla = dataProvider.getPokemonEvolution(1);

    }
}