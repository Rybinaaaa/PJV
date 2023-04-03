package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Citac extends JFrame {
    private JButton plus, minus, reset;
    private JLabel text;

    public Citac(String title) throws HeadlessException{
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,800);
        this.setVisible(true);

        plus = new JButton("plus");
        minus = new JButton("minus");
        reset = new JButton("reset");
        text = new JLabel("100");

        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();

        panel1.setBackground(Color.red);
        panel1.setLayout(null);
        panel1.setPreferredSize(new Dimension(150, 200));
        panel1.add(plus);
        plus.setBounds(20, 20 , 60 , 80);

//        this.add(plus, BorderLayout.NORTH);
        this.add(panel1, BorderLayout.NORTH);
        this.add(minus, BorderLayout.SOUTH);
        this.add(reset, BorderLayout.WEST);
        this.add(text, BorderLayout.CENTER);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
                System.out.println(e.getActionCommand());
                System.out.println(e.getModifiers());
                System.out.println(e.getWhen());
            }
        });
    }
}