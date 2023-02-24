package com.gcdev.moneyapi.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gcdev.moneyapi.domain.entities.Coins;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@JsonComponent
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rate {

    @JsonProperty("date")
    private LocalDate date;
    @JsonProperty("base")
    private String base;
    @JsonProperty("rates")
    private Coins rates;

}
