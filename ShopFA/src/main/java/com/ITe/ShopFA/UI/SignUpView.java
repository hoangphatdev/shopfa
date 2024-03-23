package com.ITe.ShopFA.UI;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class SignUpView {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernametxt;
    private JTextField passwordtxt;
    private JTextField emailtxt;
    private JTextField phonetxt;
    private JLabel passwordlbl;
    private JLabel emaillbl;
    private JLabel sendotpbtn;
    private JLabel verifybtn;
    private JLabel phonelbl;
    private JLabel addresslbl;
    private JTextField addresstxt;
    private JLabel imglbl;
    private JLabel otplbl;
    private JTextField otptxt;
    private JLabel signuplbl;
    private JLabel usernamelbl;
    private JLabel offbtn;
    private JLabel returnbtn;
    private JLabel submitbtn;

    public SignUpView() {
        init();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUpView frame = new SignUpView();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
   public void init(){
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 100, 1203, 723);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    frame.setContentPane(contentPane);
    contentPane.setLayout(null);
    /////////////////////////////////////////////////////////////////////////////////////////
    addresstxt = new JTextField();
    addresstxt.setColumns(10);
    addresstxt.setBounds(450, 371, 312, 49);
    contentPane.add(addresstxt);

    otptxt = new JTextField();
    otptxt.setColumns(10);
    otptxt.setBounds(450, 490, 204, 49);
    contentPane.add(otptxt);

    usernametxt = new JTextField();
    usernametxt.setBounds(450, 164, 312, 49);
    contentPane.add(usernametxt);
    usernametxt.setColumns(10);

    passwordtxt = new JTextField();
    passwordtxt.setColumns(10);
    passwordtxt.setBounds(450, 233, 312, 49);
    contentPane.add(passwordtxt);

    emailtxt = new JTextField();
    emailtxt.setColumns(10);
    emailtxt.setBounds(450, 431, 204, 49);
    contentPane.add(emailtxt);

    phonetxt = new JTextField();
    phonetxt.setColumns(10);
    phonetxt.setBounds(450, 303, 312, 49);
    contentPane.add(phonetxt);

    /////////////////////////////////////////////////////////////////////////////////////////////
    signuplbl = new JLabel("SHOPFA SIGN UP");
    signuplbl.setFont(new Font("MOTO VERSE", Font.BOLD, 32));
    signuplbl.setHorizontalAlignment(SwingConstants.CENTER);
    signuplbl.setBounds(0, 0, 1203, 147);
    signuplbl.setForeground(new Color(219, 98, 29));
    contentPane.add(signuplbl);

    usernamelbl = new JLabel("UserName");
    usernamelbl.setFont(new Font("Roboto", Font.BOLD, 15));
    usernamelbl.setBounds(355, 164, 85, 49);
    usernamelbl.setForeground(new Color(219, 42, 89));
    contentPane.add(usernamelbl);

    passwordlbl = new JLabel("Password");
    passwordlbl.setFont(new Font("Roboto", Font.BOLD, 15));
    passwordlbl.setBounds(355, 233, 85, 49);
    passwordlbl.setForeground(new Color(219, 42, 89));
    contentPane.add(passwordlbl);

    emaillbl = new JLabel("Email");
    emaillbl.setFont(new Font("Roboto", Font.BOLD, 15));
    emaillbl.setBounds(355, 430, 85, 49);
    emaillbl.setForeground(new Color(219, 42, 89));
    contentPane.add(emaillbl);

    phonelbl = new JLabel("Phone");
    phonelbl.setFont(new Font("Roboto", Font.BOLD, 15));
    phonelbl.setBounds(355, 303, 85, 49);
    phonelbl.setForeground(new Color(219, 42, 89));
    contentPane.add(phonelbl);

    addresslbl = new JLabel("Address");
    addresslbl.setFont(new Font("Roboto", Font.BOLD, 15));
    addresslbl.setBounds(355, 371, 85, 49);
    addresslbl.setForeground(new Color(219, 42, 89));
    contentPane.add(addresslbl);

    otplbl = new JLabel("OTP");
    otplbl.setFont(new Font("Roboto", Font.BOLD, 15));
    otplbl.setBounds(355, 490, 85, 49);
    otplbl.setForeground(new Color(219, 42, 89));
    contentPane.add(otplbl);
/////////////////////////////////////////////////////////////////////////////////////////////////////
    offbtn = new JLabel("OFF");
    offbtn.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            frame.dispose();
        }
    });
    offbtn.setHorizontalAlignment(SwingConstants.CENTER);
    offbtn.setFont(new Font("Roboto", Font.BOLD, 15));
    offbtn.setBounds(88, 508, 159, 49);
    offbtn.setForeground(new Color(219, 42, 89));
    contentPane.add(offbtn);

    sendotpbtn = new JLabel("Send OTP");
    sendotpbtn.setHorizontalAlignment(SwingConstants.CENTER);
    sendotpbtn.setFont(new Font("Roboto", Font.BOLD, 15));
    sendotpbtn.setBounds(664, 430, 98, 49);
    sendotpbtn.setBackground(new Color(75, 108, 112));
    sendotpbtn.setOpaque(true);
    sendotpbtn.setForeground(new Color(179, 165, 162));
    contentPane.add(sendotpbtn);

    verifybtn = new JLabel("Verify");
    verifybtn.setHorizontalAlignment(SwingConstants.CENTER);
    verifybtn.setFont(new Font("Roboto", Font.BOLD, 15));
    verifybtn.setBounds(664, 490, 98, 49);
    verifybtn.setBackground(new Color(75, 108, 112));
    verifybtn.setOpaque(true);
    verifybtn.setForeground(new Color(179, 165, 162));
    contentPane.add(verifybtn);

    returnbtn = new JLabel("Return to sign in page");
    returnbtn.setForeground(new Color(255, 255, 255));
    returnbtn.setBounds(88, 591, 146, 68);
    contentPane.add(returnbtn);

    submitbtn = new JLabel("Submit");
    submitbtn.setForeground(new Color(255, 255, 255));
    submitbtn.setHorizontalAlignment(SwingConstants.CENTER);
    submitbtn.setBounds(544, 601, 106, 49);
    contentPane.add(submitbtn);

    imglbl = new JLabel("New label");
    imglbl.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\1203 723.jpg"));
    imglbl.setBounds(0, 0, 1203, 723);
    contentPane.add(imglbl);

    frame.setLocationRelativeTo(null);
    frame.setUndecorated(true);
    frame.setVisible(true);
}
}

