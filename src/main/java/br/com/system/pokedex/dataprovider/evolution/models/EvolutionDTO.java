package br.com.system.pokedex.dataprovider.evolution.models;

import br.com.system.pokedex.dataprovider.evolution.models.ChainDTO;
import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EvolutionDTO implements Serializable {
    String baby_trigger_item;
    ChainDTO chain;
    Integer id;
}
