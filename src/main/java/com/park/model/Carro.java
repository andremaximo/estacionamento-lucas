package com.park.model;

public class Carro {
	
	private String placa;

    public Carro() {}

    public Carro(final String placa) {
        this.placa = placa;
    }
   
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(final String placa) {
        this.placa = placa;
    }
}
