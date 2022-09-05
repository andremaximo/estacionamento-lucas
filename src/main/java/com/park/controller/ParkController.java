package com.park.controller;

import com.park.model.IParkService;
import com.park.model.ParkService;

public class ParkController implements IParkController{

    private IParkService parkService = null;
    
    
    public ParkController() {
    	
    	 parkService = new ParkService();
    }

    @Override
    public void iniciaEstacionamento(final String numeroVagas) {
//    	qtdVagas = Integer.parseInt(numeroVagas);
    	
//    
        parkService.iniciaEstacionamento(numeroVagas);
                
    }

    @Override
    public int getQtdVagasOcupadas() {
    	return parkService.getQtdVagasOcupadas();
    }

    @Override
    public int getQtdVagasDisponiveis() {
        return parkService.getQtdVagasDisponiveis();
    }

    @Override
    public int getQtdVagas() {
        return parkService.getQtdVagas();
    }

    @Override
    public void addCarro(final String placa) {
//        System.out.println(String.format("Carro %s adicionado.", placa));
        parkService.addCarro(placa);
    }

    @Override
    public void removeCarro(final String placa) {
//        System.out.println(String.format("Carro %s removido.", placa));
        parkService.removeCarro(placa);
    }

    @Override
    public int encontraCarro(final String placa) {
        return parkService.encontraCarro(placa);
    }
}
