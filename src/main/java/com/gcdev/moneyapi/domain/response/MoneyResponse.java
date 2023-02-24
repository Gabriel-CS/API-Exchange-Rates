package com.gcdev.moneyapi.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;


@Data
@NoArgsConstructor
@JsonComponent
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoneyResponse {

    @JsonProperty("value")
    private Double value;
    @JsonProperty("value_in_brl")
    private Double valueInBrl;
    @JsonProperty("value_in_usd")
    private Double valueInUsd;
    @JsonProperty("value_in_eur")
    private Double valueInEur;
    @JsonProperty("value_in_jpy")
    private Double valueInJpy;

}
