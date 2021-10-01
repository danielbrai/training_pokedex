package br.com.system.pokedex.entrypoint.restful.evolution;

//import com.sun.istack.internal.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EvolutionModelOut {

    //@NotNull
    private Integer id;

    //@NotNull
    private String name;

}
