package br.com.system.pokedex.dataprovider.evolution;


import br.com.system.pokedex.core.evolution.EvolutionEntity;
import br.com.system.pokedex.core.evolution.EvolutionGateway;
import br.com.system.pokedex.dataprovider.evolution.adapter.EvolutionAdapter;
import br.com.system.pokedex.dataprovider.evolution.models.EvolutionDTO;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component
public class EvolutionDataProvider implements EvolutionGateway {

    @Override
    public List<EvolutionEntity> getPokemonEvolution(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String evolutionResourceUrl = "https://pokeapi.co/api/v2/evolution-chain/";


        ResponseEntity<EvolutionDTO> response = restTemplate.exchange(evolutionResourceUrl + id.toString(), HttpMethod.GET, entity, EvolutionDTO.class);
        EvolutionDTO body = response.getBody();


//        EvolutionDTO object = restTemplate.getForObject(evolutionResourceUrl.concat(id.toString()), EvolutionDTO.class);

//        EvolutionDTO result = restTemplate
//                .getForObject(evolutionResourceUrl + id.toString(), EvolutionDTO.class);

//        EvolutionAdapter bla = new EvolutionAdapter();
        return null;

//        return bla.mapRow(result);
    }
}
