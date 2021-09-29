package br.com.system.pokedex.entrypoint.restful.evolution;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EvolutionModelList {

    private List<EvolutionModelOut> evolutions;

}
