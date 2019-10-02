package br.com.senac.pi.ui;
//só um teste
public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });

    }
}
