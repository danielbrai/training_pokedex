package br.com.system.pokedex.core.evolution;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "from")
@Builder
@Data
public class EvolutionEntity {

    @NotNull
    private Integer id;

    @NotNull
    private String name;

}
