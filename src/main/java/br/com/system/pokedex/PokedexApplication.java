package br.com.system.pokedex;

import br.com.system.pokedex.dataprovider.evolution.EvolutionDataProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
		EvolutionDataProvider dataProvider = new EvolutionDataProvider();
		dataProvider.getPokemonEvolution(1);
	}

}
