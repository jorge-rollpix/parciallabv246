package edu.utn.ROMERORAJOYLABV.service;

import edu.utn.ROMERORAJOYLABV.model.PhoneLine;
import edu.utn.ROMERORAJOYLABV.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;


    public ResponseEntity<List<PhoneLine>> getAllPhoneLinesByPrefix(Integer prefix) {
        return integrationComponent.getAllPhoneLinesByPrefixFromApi(prefix);
    }
}

