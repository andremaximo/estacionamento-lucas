package com.park.controller;

import com.park.model.IParkService;

public class ParkController implements IParkController{

    private final IParkService parkService = null;
    int qtdVagas = 0;

    @Override
    public void iniciaEstacionamento(final String numeroVagas) {
        qtdVagas = Integer.parseInt(numeroVagas);
        System.out.println(String.format("Estacionamento com %s vagas criado.", numeroVagas));
        /*parkService.iniciaEstacionamento(numeroVagas);*/
    }

    @Override
    public int getQtdVagasOcupadas() {
        return 1;
        /*return parkService.getQtdVagasOcupadas();*/
    }

    @Override
    public int getQtdVagasDisponiveis() {
        return 2;
        /*return getQtdVagasDisponiveis();*/
    }

    @Override
    public int getQtdVagas() {
        return qtdVagas;
        /*return getQtdVagas();*/
    }

    @Override
    public void addCarro(final String placa) {
        System.out.println(String.format("Carro %s adicionado.", placa));
        /*parkService.addCarro(placa);*/
    }

    @Override
    public void removeCarro(final String placa) {
        System.out.println(String.format("Carro %s removido.", placa));
        /*parkService.removeCarro(placa);*/
    }

    @Override
    public int encontraCarro(final String placa) {
        return 6;
        /*return encontraCarro(placa);*/
    }
}
