package edu.utn.ROMERORAJOYLABV.controller;

import edu.utn.ROMERORAJOYLABV.model.PhoneLine;
import edu.utn.ROMERORAJOYLABV.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phone_line")
public class Controller {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/byPrefix/{prefix}")
    public ResponseEntity<List<PhoneLine>> getAllPhoneLinesByPrefix(@PathVariable Integer prefix) {
        return integrationService.getAllPhoneLinesByPrefix(prefix);
    }


}
