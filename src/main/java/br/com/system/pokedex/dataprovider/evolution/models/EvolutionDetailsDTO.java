package br.com.system.pokedex.dataprovider.evolution.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EvolutionDetailsDTO implements Serializable {

    private String gender;
    private String held_item;
    private String item;
    private String known_move;
    private String known_move_type;
    private String location;
    private String min_affection;
    private String min_beauty;
    private String min_happiness;
    private Integer min_level;
    private Boolean needs_overworld_rain;
    private String party_species;
    private String party_type;
    private String relative_physical_stats;
    private String time_of_day;
    private String trade_species;
    private Trigger trigger;
    private Boolean turn_upside_down;
}
