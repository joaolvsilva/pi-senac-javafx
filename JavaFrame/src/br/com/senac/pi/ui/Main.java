package br.com.senac.pi.ui;

public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });

    }
}
