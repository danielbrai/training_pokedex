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
public class Trigger implements Serializable {
    private String name;
    private String url;
}
