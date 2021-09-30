package br.com.system.pokedex.dataprovider.evolution.models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SpeciesDTO implements Serializable {
    String name;
    String url;
}
