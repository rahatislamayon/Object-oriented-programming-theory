package javaPractice.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gui {
    static int count=0;
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JButton plus=new JButton("+");
        JButton minus=new JButton("-");

        JLabel display=new JLabel(String.valueOf(count));


        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        display.setBounds(250,100,200,100);
        plus.setBounds(100,250,80,50);
        minus.setBounds(300,250,80,50);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                display.setText(String.valueOf(count));
                System.out.println(count);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                display.setText(String.valueOf(count));
                System.out.println(count);
            }
        });

        frame.add(plus);
        frame.add(minus);
        frame.add(display);


    }
}
