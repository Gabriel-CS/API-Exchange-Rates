package com.gcdev.moneyapi.domain.services;

import com.gcdev.moneyapi.domain.entities.Coins;
import com.gcdev.moneyapi.domain.response.RatesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class IntegrationService {

    private static final String API_URL = "http://api.opencambio.org/v1/currencies/"; // URL base da api utilizada na integração

    private RestTemplate restTemplate; // responsável por realizar as requisições HTTP

    public RatesResponse getRatesByCoin(String coin) { // método para extrair as cotações da API integrada
        restTemplate = new RestTemplate();
        String date = LocalDate.now().toString();
        String path = API_URL + coin + "/rates?start=" + date + "&end=" + date;

        return restTemplate.getForObject(path, RatesResponse.class);
    }

}
