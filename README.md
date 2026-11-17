# GUI-exercise

Java Swing Login Form

1. Project Description
This project is a simple Login Form application developed using Java Swing. The application allows users to enter a username and password to access the system. It demonstrates five GUI components/parts: Top-Level Container, Intermediate Container, Atomic Components, Layout Manager, and Event Handling.

2. GUI Components/Parts

1. Top-Level Container

- JFrame: Used as the main application window.
- Implemented in FormLogin.java.
- The JFrame displays the login form and sets the window title, size, and position.

2. Intermediate Container

- JPanel: Used as a container to organize and group GUI components.
- The main panel is PanelLogin.
- Another JPanel named panelForm is used to organize the input fields and buttons.

3. Atomic Components

The application uses several basic GUI components:

- JLabel: Displays text such as “FORM LOGIN”, “Username”, and “Password”.
- JTextField: Allows users to enter their username.
- JPasswordField: Allows users to enter their password securely by hiding the characters.
- JButton: Provides Login and Reset buttons.
- JOptionPane: Displays login success or error messages.

4. Layout Manager

The application uses two different layout managers:

- BorderLayout: Organizes the title at the top and the login form in the center.
- GridLayout: Arranges the username, password, and buttons into 3 rows and 2 columns.

5. Event Handling

Event handling is implemented using ActionListener and actionPerformed().

- Login Button: Checks whether the entered username and password match the predefined credentials.
- Reset Button: Clears the username and password fields.


<img width="758" height="474" alt="Screenshot 2026-11-17 193401" src="https://github.com/user-attachments/assets/53bcb88b-2a54-4473-bc9b-38b07783874a" />
