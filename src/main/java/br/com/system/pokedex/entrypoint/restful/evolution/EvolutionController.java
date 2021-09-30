package br.com.system.pokedex.entrypoint.restful.evolution;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Evolution")
@RestController
public class EvolutionController {

    @GetMapping("/evolution/{id}")
    public EvolutionModelList listarEvolucoes (@PathVariable("id") Integer id) {

        return null;
    }

}
