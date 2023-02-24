package com.gcdev.moneyapi.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

@Data
@NoArgsConstructor
@JsonComponent
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coins {

    @JsonProperty("BRL")
    private Double brl;
    @JsonProperty("USD")
    private Double usd;
    @JsonProperty("EUR")
    private Double eur;
    @JsonProperty("JPY")
    private Double jpy;

}
