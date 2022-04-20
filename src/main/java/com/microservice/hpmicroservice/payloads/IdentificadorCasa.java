package com.microservice.hpmicroservice.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdentificadorCasa {
    @JsonProperty("sorting-hat-choice")
    private String sortingHatChoice;
}
