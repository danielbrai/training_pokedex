package br.com.system.pokedex.dataprovider.evolution;


import br.com.system.pokedex.core.evolution.EvolutionEntity;
import br.com.system.pokedex.core.evolution.EvolutionGateway;
import br.com.system.pokedex.dataprovider.evolution.adapter.EvolutionAdapter;
import br.com.system.pokedex.dataprovider.evolution.models.EvolutionDTO;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

public class EvolutionDataProvider implements EvolutionGateway {

    @Override
    public List<EvolutionEntity> getPokemonEvolution(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String evolutionResourceUrl = "https://pokeapi.co/api/v2/evolution-chain/";

        EvolutionDTO result = restTemplate
                .exchange(evolutionResourceUrl + id.toString(), HttpMethod.GET, entity, EvolutionDTO.class)
                .getBody();

//        EvolutionDTO result = restTemplate
//                .getForObject(evolutionResourceUrl + id.toString(), EvolutionDTO.class);

//        EvolutionAdapter bla = new EvolutionAdapter();
        return null;

//        return bla.mapRow(result);
    }
}
