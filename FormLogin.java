import javax.swing.*;

public class FormLogin extends JFrame {

    public FormLogin() {

        setTitle("Aplikasi Form Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Membuat panel login
        PanelLogin panel = new PanelLogin();

        // Menambahkan panel ke JFrame
        add(panel);

    }
}