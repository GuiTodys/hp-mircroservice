package com.microservice.hpmicroservice.services.aluno;

import com.microservice.hpmicroservice.payloads.HouseDetails;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultarInformacoesCasa {
    public HouseDetails execute(String casaId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<HouseDetails> casaAlunoResponseEntity = restTemplate.exchange("https://api-harrypotter.herokuapp.com/house/{casaId}", HttpMethod.GET,
                entity, HouseDetails.class, casaId);

        return casaAlunoResponseEntity.getBody();
    }
}
