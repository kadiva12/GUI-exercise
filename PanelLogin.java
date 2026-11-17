import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLogin extends JPanel {

    JLabel lblJudul, lblUsername, lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnReset;

    public PanelLogin() {

        // Layout pertama: BorderLayout
        setLayout(new BorderLayout(10, 10));

        // Mengatur jarak tepi panel
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Membuat judul
        lblJudul = new JLabel("FORM LOGIN");
        lblJudul.setHorizontalAlignment(JLabel.CENTER);

        // Membuat panel kedua
        JPanel panelForm = new JPanel();

        // Layout kedua: GridLayout
        panelForm.setLayout(new GridLayout(3, 2, 10, 10));

        // Membuat komponen
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");

        txtUsername = new JTextField();
        txtPassword = new JPasswordField();

        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        // Memasukkan komponen ke panel form
        panelForm.add(lblUsername);
        panelForm.add(txtUsername);
        panelForm.add(lblPassword);
        panelForm.add(txtPassword);
        panelForm.add(btnLogin);
        panelForm.add(btnReset);

        // Memasukkan judul dan panel form ke panel utama
        add(lblJudul, BorderLayout.NORTH);
        add(panelForm, BorderLayout.CENTER);

        // Event Handling Login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if (username.equals("kadiva") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(PanelLogin.this,
                            "Login Berhasil!");
                } else {
                    JOptionPane.showMessageDialog(PanelLogin.this,
                            "Username atau Password Salah!");
                }
            }
        });

        // Event Handling Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                txtPassword.setText("");
            }
        });
    }
}