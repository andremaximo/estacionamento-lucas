package com.park.view;

import com.park.controller.IParkController;

import javax.swing.*;
import java.awt.*;

public class EstacionamentoView {

    JPanel card;

    HomeView app;

    IParkController parkController;


    public EstacionamentoView(final HomeView app, final IParkController parkController) {

        this.app = app;
        this.parkController = parkController;

        // cria o painel de botoes
        card = new JPanel(new GridLayout(2, 1, 20, 20));

        JPanel cardCampos = new JPanel(new GridLayout(1, 2));
        JLabel label = new JLabel("Entre com a quantidade de vagas: ");
        JTextField tf = new JTextField();
        cardCampos.add(label);
        cardCampos.add(tf);

        JPanel cardAcao = new JPanel(new GridLayout(1, 1));
        JButton send = new JButton("Iniciar");
        send.addActionListener(listener -> {
            this.parkController.iniciaEstacionamento(tf.getText());
            if(this.parkController.getQtdVagas() > 0){

                card.removeAll();

                card.setLayout(new GridLayout(3, 3, 20, 20));

                JLabel addLabel = new JLabel("Informe a placa para adicionar um carro: ");
                JTextField addTf = new JTextField();
                JButton addSubmit = new JButton("Entrar");
                addSubmit.addActionListener(event -> {
                    this.parkController.addCarro(addTf.getText());
                });
                card.add(addLabel);
                card.add(addTf);
                card.add(addSubmit);

                JLabel removeLabel = new JLabel("Informe a placa para remover um carro: ");
                JTextField removeTf = new JTextField();
                JButton removeSubmit = new JButton("Remover");
                removeSubmit.addActionListener(event -> {
                    this.parkController.removeCarro(removeTf.getText());
                });
                card.add(removeLabel);
                card.add(removeTf);
                card.add(removeSubmit);

                JLabel buscaLabel = new JLabel("Informe a placa para encontrar um carro: ");
                JTextField buscaTf = new JTextField();
                JButton buscaSubmit = new JButton("Encontrar");
                buscaSubmit.addActionListener(event -> {
                    int vaga = this.parkController.encontraCarro(buscaTf.getText());
                    JOptionPane.showMessageDialog (null, String.format("O carro está na vaga: %s", vaga));
                });
                card.add(buscaLabel);
                card.add(buscaTf);
                card.add(buscaSubmit);

                card.updateUI();
                app.pack();
            }
        });

        cardAcao.add(send);

        card.add(cardCampos);
        card.add(cardAcao);
    }

    public void reload() {

        if(this.parkController.getQtdVagas() > 0){
            card.removeAll();

            card.setLayout(new GridLayout(3, 3, 20, 20));

            JLabel addLabel = new JLabel("Informe a placa para adicionar um carro: ");
            JTextField addTf = new JTextField();
            JButton addSubmit = new JButton("Entrar");
            addSubmit.addActionListener(event -> {
                this.parkController.addCarro(addTf.getText());
            });
            card.add(addLabel);
            card.add(addTf);
            card.add(addSubmit);

            JLabel removeLabel = new JLabel("Informe a placa para remover um carro: ");
            JTextField removeTf = new JTextField();
            JButton removeSubmit = new JButton("Remover");
            removeSubmit.addActionListener(event -> {
                this.parkController.removeCarro(removeTf.getText());
            });
            card.add(removeLabel);
            card.add(removeTf);
            card.add(removeSubmit);

            JLabel buscaLabel = new JLabel("Informe a placa para encontrar um carro: ");
            JTextField buscaTf = new JTextField();
            JButton buscaSubmit = new JButton("Encontrar");
            buscaSubmit.addActionListener(event -> {
                int vaga = this.parkController.encontraCarro(buscaTf.getText());
                JOptionPane.showMessageDialog (null, String.format("O carro está na vaga: %s", vaga));
            });
            card.add(buscaLabel);
            card.add(buscaTf);
            card.add(buscaSubmit);

            card.updateUI();
            app.pack();
        }


    }
}
