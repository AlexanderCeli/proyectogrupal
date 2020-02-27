/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgrupal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class cventana {
    JFrame frame = new JFrame("Alumno");
    JPanel pane;
    JTextField tex;
    GridBagLayout q;
    JLabel headerLabel;
    JLabel headerLabe2;
    JTextField texto;
    JTextField texto1;
    JLabel labe13;
    JCheckBox C1;
    JCheckBox C2;
    JLabel l;
    JTextField texto2;
    JLabel l2;
    JTextField texto3;
    JCheckBox C3;
    JCheckBox C4;
    JTextField texto4;
    JButton buttonA;
    JButton b2;

    public cventana() {
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame frame = new JFrame("Alumno");
        frame.setSize(400, 500);
        JPanel pane = new JPanel(new GridBagLayout());
        frame.setContentPane(pane);
        JTextField tex = new JTextField();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 2;
        c.weighty = 2;
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel headerLabel = new JLabel("Nombre Completos");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 0;

        pane.add(headerLabel, c);

        JLabel headerLabe2 = new JLabel("Edad:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 1;

        pane.add(headerLabe2, c);

        JTextField texto = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 0;

        pane.add(texto, c);

        JTextField texto1 = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 1;

        pane.add(texto1, c);

        JLabel labe13 = new JLabel("Sexo:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;

        pane.add(labe13, c);

        JCheckBox C1 = new JCheckBox("Mujer");
        C1.setBackground(Color.lightGray);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 3;

        pane.add(C1, c);

        JCheckBox C2 = new JCheckBox("Hombre");
        C2.setBackground(Color.lightGray);
        c.gridx = 3;
        c.gridwidth = 3;
        c.gridy = 4;

        pane.add(C2, c);

        JLabel l = new JLabel("Curso");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 5;

        pane.add(l, c);

        JTextField texto2 = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 5;

        pane.add(texto2, c);

        JLabel l2 = new JLabel("Horario");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 6;

        pane.add(l2, c);

        JTextField texto3 = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 6;

        pane.add(texto3, c);

        JCheckBox C3 = new JCheckBox("DNI");

        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 7;

        pane.add(C3, c);

        JCheckBox C4 = new JCheckBox("OTRO DOCUMENTO");

        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 7;

        pane.add(C4, c);

        JTextField texto4 = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 8;

        pane.add(texto4, c);

        JButton buttonA = new JButton("Registrar");
        buttonA.setBackground(Color.lightGray);
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 9;

        pane.add(buttonA, c);

        JButton b2 = new JButton("Salir");
        b2.setBackground(Color.lightGray);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 9;

        pane.add(b2, c);
        

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText() == "Salir") {
                    System.exit(0);
                } else {
                    dispose();
                }

            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        cventana a = new cventana();
    }
}
