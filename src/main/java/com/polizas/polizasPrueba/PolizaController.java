package com.polizas.polizasPrueba;

import com.polizas.polizasPrueba.Poliza;
import com.polizas.polizasPrueba.PolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolizaController {

    @Autowired
    private PolizaService service;


    @GetMapping("/datos-polizas")
    public List<Poliza> listarPolizas(){
        return service.listarPolizas();
    }

     @GetMapping("/datos-polizas/{idPoliza}")
    public ResponseEntity<Poliza> obtenerPoliza(@PathVariable Integer idPoliza){
        try {
            Poliza poliza = service.obtenerPolizasPorId(idPoliza);
            return new ResponseEntity<Poliza>(poliza, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<Poliza>(HttpStatus.NOT_FOUND);
        }
    }

}
