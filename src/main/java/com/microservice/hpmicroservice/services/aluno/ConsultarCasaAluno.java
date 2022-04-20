package com.microservice.hpmicroservice.services.aluno;

import com.microservice.hpmicroservice.payloads.IdentificadorCasa;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultarCasaAluno {
    public IdentificadorCasa execute() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<IdentificadorCasa> casaAlunoResponseEntity = restTemplate.exchange("https://api-harrypotter.herokuapp.com/sortinghat", HttpMethod.GET,
                entity, IdentificadorCasa.class);

        return casaAlunoResponseEntity.getBody();
    }
}
