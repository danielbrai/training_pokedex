package br.com.system.pokedex.core.evolution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GetEvolutionByIdUsecaseTest {

    @InjectMocks
    GetEvolutionByIdUsecase usecase;

    @Mock
    EvolutionGateway gateway;

    @Test
    void deveRetornarUmPokemonQuandoForENcontradoPeloDataProvider() {

        //AAA - Arrange, Act and Assert (Arrumar, Atuar e Assegurar)
        //Given - When - Then


        //PREPARACAO (ARRANGE ou Given): Retorno do meu dataprovider (gateway)
        List<EvolutionEntity> evolutions = new ArrayList<>();
        EvolutionEntity bulbasaur = EvolutionEntity.builder().id(1).name("Bulbasaur").build();
        evolutions.add(bulbasaur);
        Mockito.when(this.gateway.getPokemonEvolution(1)).thenReturn(evolutions);

        //ACAO (ACT ou WHEN): fazer a chamada ao método testado
        List<EvolutionEntity> pokemonReturnedList = this.usecase.execute(1);

        //VERIFICACAO (ASSERT ou THEN): Fazer as assertivas que fazem sentido ao cenário avaliado
        final String nomeEsperado = "Bulbasaur";
        final Integer idEsperado = 1;
        Assert.isTrue(pokemonReturnedList.size() == 1, "O tamanho da lista diverge do esperado");
        assertEquals(nomeEsperado, pokemonReturnedList.get(0).getName());
    }
}