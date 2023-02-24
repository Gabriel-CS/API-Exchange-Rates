package com.gcdev.moneyapi.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gcdev.moneyapi.domain.entities.Links;
import com.gcdev.moneyapi.domain.entities.Pagination;
import com.gcdev.moneyapi.domain.entities.Rate;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

import java.util.List;

@Data
@NoArgsConstructor
@JsonComponent
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RatesResponse {

    @JsonProperty("rates")
    private List<Rate> rates;

    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("_links")
    private Links links;
}
