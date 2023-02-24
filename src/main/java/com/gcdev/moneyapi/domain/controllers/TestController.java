package com.gcdev.moneyapi.domain.controllers;

import com.gcdev.moneyapi.domain.response.MoneyResponse;
import com.gcdev.moneyapi.domain.response.RatesResponse;
import com.gcdev.moneyapi.domain.services.IntegrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final IntegrationService integrationService;

    @GetMapping("/")
    public ResponseEntity<MoneyResponse> getRates(@RequestParam("coin") String coin, @RequestParam("value") Double value){
        RatesResponse ratesResponse = integrationService.getRatesByCoin(coin);

        /* MoneyResponse moneyResponse = MoneyResponse.builder()
                .value(value)
                .valueInBrl(value * ratesResponse.getRates().get(0).getRates().getBrl())
                .valueInUsd(value * ratesResponse.getRates().get(0).getRates().getUsd())
                .valueInEur(value * ratesResponse.getRates().get(0).getRates().getEur())
                .valueInJpy(value * ratesResponse.getRates().get(0).getRates().getJpy())
                .build(); */
        MoneyResponse moneyResponse = new MoneyResponse();

        moneyResponse.setValue(value);
        moneyResponse.setValueInBrl(value * ratesResponse.getRates().get(0).getRates().getBrl());
        moneyResponse.setValueInUsd(value * ratesResponse.getRates().get(0).getRates().getUsd());
        moneyResponse.setValueInEur(value * ratesResponse.getRates().get(0).getRates().getEur());
        moneyResponse.setValueInJpy(value * ratesResponse.getRates().get(0).getRates().getJpy());

        return ResponseEntity.ok(moneyResponse);
    }



}
