package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaBotoes extends JFrame {
    private final JButton botaoSimples = new JButton("Quer um balão?");
    private final JButton botaoEnfeitado = new JButton("Quer um outro balão?");
    
    public JanelaBotoes() throws HeadlessException {
        super ("Botões");
        setLayout(new FlowLayout());
        botaoSimples.setIcon(new ImageIcon("resources/Balao.png"));
        botaoSimples.setRolloverIcon(new ImageIcon("resources/PNG - Balão vermelho.png"));
        add(botaoSimples);
        add(botaoEnfeitado);
        botaoSimples.addActionListener(new botaoClicado());
        botaoEnfeitado.addActionListener(new botaoClicado());
    }

    private class botaoClicado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botaoSimples)
            {
                JOptionPane.showMessageDialog(null, "O botão simples foi clicado", "Botão", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "O botão enfeitado foi clicado!", "Botão Enfeitado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
}
