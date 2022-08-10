package com.park.view;

import com.park.controller.IParkController;
import com.park.controller.ParkController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame{

    private static final long serialVersionUID = 1L;
    final static String ESTACIONAMENTO = "ESTACIONAMENTO";
    final static String RELATORIO = "RELATORIO";

    JPanel cards;

    RelatorioView relatorioView;

    EstacionamentoView estacionamentoView;

    public HomeView(){

        IParkController parkController = new ParkController();

        setTitle("Estacionamento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = criaBarraDeMenu();
        setJMenuBar(menubar);

        cards = new JPanel(new CardLayout());
        estacionamentoView = new EstacionamentoView(this, parkController);
        cards.add(estacionamentoView.card, ESTACIONAMENTO);

        relatorioView = new RelatorioView(parkController);
        cards.add(relatorioView.card, RELATORIO);

        getContentPane().add(cards, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    private JMenuBar criaBarraDeMenu() {
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem submenu01 = new JMenuItem("Estacionamento");
        submenu01.setActionCommand(ESTACIONAMENTO);
        submenu01.addActionListener(new ChangeCardlayoutListener());

        JMenuItem submenu02 = new JMenuItem("Relatório");
        submenu02.setActionCommand(RELATORIO);
        submenu02.addActionListener(new ChangeCardlayoutListener());
        menu.add(submenu01);
        menu.add(submenu02);
        menubar.add(menu);
        return menubar;
    }

    class ChangeCardlayoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {

            estacionamentoView.reload();
            relatorioView.reload();

            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards, evt.getActionCommand());

        }
    }
}
