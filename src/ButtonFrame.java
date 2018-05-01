import javax.swing.*;
import java.lang.reflect.Array;

public class ButtonFrame extends JFrame
{
    JButton load = new JButton("Wczytaj");
    JButton save = new JButton("zapisz");
    JButton unsubscribe = new JButton("Wyrejestruj");


    public ButtonFrame()
        {
            super("ramka z przyciskami");
            setSize(340,170);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            panel.add(load);
            panel.add(save);
            panel.add(unsubscribe);
            add(panel);
            setVisible(true);
        }
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
            ButtonFrame fr = new ButtonFrame();
        }

}
