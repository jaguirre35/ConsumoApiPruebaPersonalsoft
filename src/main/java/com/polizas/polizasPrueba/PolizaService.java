package com.polizas.polizasPrueba;

import com.polizas.polizasPrueba.Poliza;
import com.polizas.polizasPrueba.PolizaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaService {

    @Autowired
    private PolizaRepository repository;
    public List<Poliza> listar(){
        return repository.findAll();
    }

    public List<Poliza> listarPolizas(){
        return repository.findAll();
    }

    public Poliza obtenerPolizasPorId(Integer idPoliza){
        return repository.findById(idPoliza).get();
    }


}
