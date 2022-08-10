package com.park.view;

import com.park.controller.IParkController;

import javax.swing.*;
import java.awt.*;

public class RelatorioView {

    JPanel card;

    IParkController parkController;

    public RelatorioView(final IParkController parkController) {

        this.parkController = parkController;

        // cria o painel de campos de texto
        card = new JPanel(new GridLayout(3, 1, 5, 5));
        card.add(new JLabel(String.format("Quantidade de vagas totais: %s", parkController.getQtdVagas())));
        card.add(new JLabel(String.format("Quantidade de vagas ocupadas: %s", parkController.getQtdVagasOcupadas())));
        card.add(new JLabel(String.format("Quantidade de vagas diponiveis: %s", parkController.getQtdVagasDisponiveis())));
    }

    public void reload() {

        card.removeAll();

        card.add(new JLabel(String.format("Quantidade de vagas totais: %s", parkController.getQtdVagas())));
        card.add(new JLabel(String.format("Quantidade de vagas ocupadas: %s", parkController.getQtdVagasOcupadas())));
        card.add(new JLabel(String.format("Quantidade de vagas diponiveis: %s", parkController.getQtdVagasDisponiveis())));

        card.updateUI();
    }
}
