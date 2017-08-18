package br.ufjf.dcc171;

import javax.swing.JFrame;

public class Aula03Exm01 {

    public static void main(String[] args) {
           
        JanelaBotoes janela = new JanelaBotoes();
        janela.setSize(200, 400);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
