import javax.swing.*;

public class Authenticator extends javax.swing.JFrame
{


    public Authenticator()
        {
            //Pola tekstowe i guziki
            JTextField userName = new JTextField(15);
            JPasswordField password = new JPasswordField(15);
            JTextArea comments = new JTextArea(4,15);
            JButton ok = new JButton("ok");
            JButton cancel = new JButton("Anuluj");

            // ustawienie ramki
            setTitle("Informacje o koncie");
            setSize(300,220);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Nowy Panel
            JPanel panel = new JPanel();

            // Etykiety
            JLabel userNameLabel = new JLabel("Użytkownik: ");
            JLabel passwordLabel = new JLabel("Hasło: ");
            JLabel commentsLabel = new JLabel("Komentarz: ");

            //Ustawienia zachowania AreaText
            comments.setLineWrap(true);
            comments.setWrapStyleWord(true);

            //dodawanie elementów do panelu

            panel.add(userName);
            panel.add(userNameLabel);

            panel.add(password);
            panel.add(passwordLabel);

            panel.add(comments);
            panel.add(commentsLabel);

            panel.add(ok);
            panel.add(cancel);
            add(panel);
            setVisible(true);
        }


    //metoda ustawiająca wygląd Nimbus

    private static void setLookAndFeel()
        {
            try
                {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                }
            catch (Exception exc)
                {
                    System.out.println(exc.getMessage());
                }
        }
    public static void main(String[] args)
        {
            setLookAndFeel();
            Authenticator auth = new Authenticator();
        }

}
