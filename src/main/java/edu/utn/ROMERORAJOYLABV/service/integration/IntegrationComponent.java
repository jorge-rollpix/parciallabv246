package edu.utn.ROMERORAJOYLABV.service.integration;

import edu.utn.ROMERORAJOYLABV.model.PhoneLine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;


    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder().build();
    }


    public ResponseEntity<List<PhoneLine>> getAllPhoneLinesByPrefixFromApi(Integer prefix) {
        String url = "http://localhost:8080/phone_line/byPrefix/" + prefix;
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<List<PhoneLine>> result = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<List<PhoneLine>>() {});

        return result;

    }
}
