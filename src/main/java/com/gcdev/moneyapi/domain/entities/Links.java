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
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("first")
    private First first;
    @JsonProperty("last")
    private Last last;
    @JsonProperty("next")
    private Next next;

}
