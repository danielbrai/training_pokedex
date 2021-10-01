package br.com.system.pokedex.dataprovider.evolution.models;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ChainDTO implements Serializable {
    List<EvolutionDetailsDTO> evolution_details;
    List<ChainDTO> evolves_to;
    Boolean is_baby;
    SpeciesDTO species;
}
