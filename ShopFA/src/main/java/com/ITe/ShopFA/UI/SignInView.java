package com.ITe.ShopFA.UI;

import com.ITe.ShopFA.controller.UserController;
import com.ITe.ShopFA.model.User;
import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.EventQueue;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.util.List;

@Component
public class SignInView  {
    @Autowired
    UserController userController;

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernameTxt;
    private JTextField passwordTxt;
    private JLabel loginBtn;
    private JLabel imglbl;
    public User user;
    public SignInView() {

        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 850, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        /////////////////////////////////////////////////////////////
        JLabel signinlbl = new JLabel("SIGN IN");
        signinlbl.setFont(new Font("Roboto", Font.BOLD, 35));
        signinlbl.setHorizontalAlignment(SwingConstants.CENTER);
        signinlbl.setBounds(347, 0, 503, 114);
        signinlbl.setBackground(new Color(0));
        contentPane.add(signinlbl);

        JLabel dontHaveAccount = new JLabel("Don't have account?");
        dontHaveAccount.setBounds(664, 283, 98, 25);
        contentPane.add(dontHaveAccount);

        JLabel signupLbl = new JLabel("Sign up");
        signupLbl.setBounds(772, 289, 45, 13);
        signupLbl.setForeground(Color.red);
        contentPane.add(signupLbl);

        JLabel usernameLbl = new JLabel("UserName");
        usernameLbl.setFont(new Font("Roboto", Font.BOLD, 15));
        usernameLbl.setBounds(378, 162, 79, 45);
        contentPane.add(usernameLbl);

        JLabel passwordLbl = new JLabel("Password");
        passwordLbl.setFont(new Font("Roboto", Font.BOLD, 15));
        passwordLbl.setBounds(378, 227, 79, 45);
        contentPane.add(passwordLbl);

        ////////////////////////////////////////////
        usernameTxt = new JTextField();
        usernameTxt.setBounds(515, 162, 280, 45);
        contentPane.add(usernameTxt);
        usernameTxt.setColumns(10);

        passwordTxt = new JTextField();
        passwordTxt.setColumns(10);
        passwordTxt.setBounds(515, 228, 280, 45);
        contentPane.add(passwordTxt);
        //////////////////////////////////////////////////////
        loginBtn = new JLabel("LOGIN");
        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                User user = new User();
                String userName, password;
                userName = usernameTxt.getText();
                password = passwordTxt.getText();
                List<User> findUser =userController.fetchUserByNameAndPassword(userName, password);
                if(findUser.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Account does not exist");
                }else{
                    frame.dispose();
                    new SignUpView();
                }

            }
        });

        loginBtn.setFont(new Font("Roboto", Font.BOLD, 16));
        loginBtn.setHorizontalAlignment(SwingConstants.CENTER);
        loginBtn.setBounds(548, 325, 110, 45);
        loginBtn.setBackground(new Color(77, 32, 24));
        loginBtn.setOpaque(true);
        loginBtn.setForeground(Color.white);
        contentPane.add(loginBtn);

        JLabel closeBtn = new JLabel("OFF");
        closeBtn.setHorizontalAlignment(SwingConstants.CENTER);
        closeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });
        closeBtn.setBounds(355, 464, 124, 36);
        closeBtn.setBackground(Color.black);
        closeBtn.setOpaque(true);
        closeBtn.setForeground(Color.white);
        contentPane.add(closeBtn);


        imglbl = new JLabel("");
        imglbl.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\541-693.jpg"));
        imglbl.setBounds(0, 0, 345, 500);
        contentPane.add(imglbl);

        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignInView signUpView = new SignInView();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
