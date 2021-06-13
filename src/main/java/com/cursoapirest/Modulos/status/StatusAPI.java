package com.cursoapirest.Modulos.status;

import org.springframework.http.ResponseEntity;

public interface StatusAPI {

    ResponseEntity <StatusDTO> getStatus();

}