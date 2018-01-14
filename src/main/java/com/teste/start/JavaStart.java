package com.teste.start;

import com.teste.model.App;

import javax.swing.*;

public class JavaStart {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello munndo Swing", "Titulo", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showInputDialog("Magno Selio Coutinho da Costa");
    }

    public static String teste() {
        String name = "Olá meu nome é Magno Costa";
        name.split("teste");
        return name;
    }

}