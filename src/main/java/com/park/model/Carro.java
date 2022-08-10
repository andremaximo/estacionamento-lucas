package com.park.model;

public class Carro {

    public Carro() {}

    public Carro(final String placa) {
        this.placa = placa;
    }
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(final String placa) {
        this.placa = placa;
    }
}
