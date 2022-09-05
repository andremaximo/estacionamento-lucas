package com.park.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.park.controller.ParkController;

public class ParkService implements IParkService {

	int qtdVagas;

	List<String> carros;

	int vagasDisp;

	public ParkService() {

		carros = new ArrayList();

		qtdVagas = 0;

	}

	@Override
	public void iniciaEstacionamento(final String numeroVagas) {

		System.out.println(String.format("Estacionamento com %s vagas criado.", numeroVagas));
		qtdVagas = Integer.parseInt(numeroVagas);
	}

	@Override
	public int getQtdVagasOcupadas() {



		int tamanho = this.carros.size();

		return tamanho;

	}

	@Override
	public int getQtdVagasDisponiveis() {

		if (getQtdVagasOcupadas() >= 1) {
			vagasDisp = qtdVagas - getQtdVagasOcupadas();
			
			return vagasDisp;
		} else {
			return qtdVagas;
		}

	}

	@Override
	public int getQtdVagas() {
		return qtdVagas;
	}

	@Override
	public void addCarro(final String placa) {

		
		boolean contem = carros.contains(placa);
		System.out.println(contem);
		
		if(contem) {
			System.out.println("CARRO JA SE ENCONTRA NO ESTACIONAMENTO");
			JOptionPane.showMessageDialog(null, "CARRO JA SE ENCONTRA NO ESTACIONAMENTO", "Alerta", JOptionPane.ERROR_MESSAGE);
		
		}else{
			if (qtdVagas == getQtdVagasOcupadas()) {
				System.out.println("ESTACIONAMENTO LOTADO");
				JOptionPane.showMessageDialog(null, "ESTACIONAMENTO LOTADO", "Alerta", JOptionPane.ERROR_MESSAGE );
			}else{
	
				carros.add(placa);
				System.out.println("O Carro de " + placa + " foi adicionado.");
			}
		}

		System.out.println(carros);

//		System.out.println("vagas ocupadas " + tamanho);

	}

	@Override
	public void removeCarro(final String placa) {

		carros.remove(placa);

		System.out.println(carros);

//		System.out.println("vagas ocupadas " + carros.size());
	}

	@Override
	public int encontraCarro(final String placa) {

		
//		System.out.println(carros.indexOf(placa));

		return carros.indexOf(placa) + 1;
	}
}
