package com.Tema1;

import javax.swing.*;

/**
 * author: andreea draghici
 * 2022
 * Regex , LFA LAB
 */

public class Main {

    /**
     * Launch the application.
     */

    public static void main(String[] args) {

        try {
            Controller window = new Controller();
            window.getFrame().setVisible(true);
            window.getFrame().setResizable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

}
