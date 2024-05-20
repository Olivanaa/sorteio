package br.com.fiap.sorteio;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("dado")
@Tag(name = "Dado")
public class DadoController {

    private Random ale = new Random();

    @GetMapping
    @ResponseBody
    @Operation(
        summary = "retornar um número entre 1 e 6", 
        description = "Retornar número entre 1 e 6 aleatoriamente."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Número retornado com sucesso!"),
            @ApiResponse(responseCode = "401", description = "Acesso não permitido. É necessário autentificação.", content = @Content)
    })
    public int lancarDado() {
        return ale.nextInt(6) + 1;
    }
    
    @GetMapping("{maximo}")
    @ResponseBody
       @Operation(
        summary = "retornar um número entre 1 e máximo", 
        description = "Retornar número entre 1 e máximo passado por parâmetro aleatoriamente."
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Número retornado com sucesso!"),
        @ApiResponse(responseCode = "401", description = "Acesso não permitido. É necessário autentificação.", content = @Content)
    })
    public int lancarMaximo(@PathVariable int maximo) {
        return ale.nextInt(maximo) + 1;
    }
   
    
}

