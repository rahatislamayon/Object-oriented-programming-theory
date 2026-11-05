package javaPractice.src;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class logingui {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Login Form");



        JLabel username = new JLabel("Username");
        JTextField username1 = new JTextField();

        JLabel password = new JLabel("Password");
        JPasswordField password1 = new JPasswordField();


        JCheckBox rememberBox = new JCheckBox("Remember me");

        JButton loginButton = new JButton("Login");

        JTextArea textArea = new JTextArea();
        JButton show= new JButton("Show");


        frame.setLayout(null);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        username.setBounds(50, 50, 100, 30);
        username1.setBounds(160, 50, 200, 30);

        password.setBounds(50, 100, 100, 30);
        password1.setBounds(160, 100, 200, 30);


        rememberBox.setBounds(160, 140, 150, 30);

        loginButton.setBounds(160, 180, 100, 35);

        textArea.setBounds(160, 250, 200, 100);
        show.setBounds(210, 380, 100, 35);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   File file = new File("C:\\Users\\USER\\Desktop\\javacode\\javaPractice\\src\\login.txt");
                   FileWriter fw = new FileWriter(file,true);
                   BufferedWriter bw = new BufferedWriter(fw);
                   String username = username1.getText();
                   String password = new String(password1.getPassword());
                   bw.write("Username: "+username+" "+ "password: "+password);
                   bw.newLine();
                   bw.close();
                   username1.setText("");
                   password1.setText("");
                  System.out.println("Login Successful");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("C:\\Users\\USER\\Desktop\\javacode\\javaPractice\\src\\login.txt");

                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while (true) {
                        if((line = br.readLine())!=null){
                            textArea.append(line+"\n");
                        }
                        else {
                            break;
                        }
                    }


                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });


        frame.add(username);
        frame.add(username1);
        frame.add(password);
        frame.add(password1);
        frame.add(rememberBox);
        frame.add(loginButton);
        frame.add(textArea);
        frame.add(show);

        frame.setVisible(true);
    }
}