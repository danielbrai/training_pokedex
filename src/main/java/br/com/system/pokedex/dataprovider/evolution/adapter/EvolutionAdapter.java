package br.com.system.pokedex.dataprovider.evolution.adapter;

import br.com.system.pokedex.core.evolution.EvolutionEntity;
import br.com.system.pokedex.dataprovider.evolution.models.EvolutionDTO;

import java.util.List;

public class EvolutionAdapter {

    public EvolutionEntity mapRow(List<EvolutionDTO> result) {
        return EvolutionEntity.builder()
                .id(result.get(0).getId())
//                .name(result.get(0).getChain().get(0).getSpecies().get(0).getName())
                .build();
    }
}
