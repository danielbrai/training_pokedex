package br.com.system.pokedex.dataprovider.evolution.models;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ChainDTO implements Serializable {
    List<String> evolution_details;
    List<ChainDTO> envolves_to;
    Boolean is_baby;
    SpeciesDTO species;

}
