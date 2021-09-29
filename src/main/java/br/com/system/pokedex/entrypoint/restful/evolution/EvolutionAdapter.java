package br.com.system.pokedex.entrypoint.restful.evolution;

import br.com.system.pokedex.core.evolution.EvolutionEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EvolutionAdapter {

    public EvolutionModelList fromEvolution(List<EvolutionEntity> evolutionEntity) {

        EvolutionModelList buildEvolution = EvolutionModelList.builder().build();

        final List<EvolutionModelOut> listEvolutionModelOut = evolutionEntity.stream().map(e -> {
            return EvolutionModelOut.builder()
                    .id(e.getId())
                    .name(e.getName())
                    .build();

        }).collect(Collectors.toList());
        buildEvolution.setEvolutions(listEvolutionModelOut);
        return buildEvolution;
    }

}
