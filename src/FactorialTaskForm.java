import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daniil on 08.01.2019.
 */
public class FactorialTaskForm extends JFrame{
    private JButton calcutateButton;
    private JPanel MainPanel;
    private JTextArea textArea1;


    public void init()
    {
        this.setTitle("Factorial Task");
        this.setContentPane(new FactorialTaskForm().MainPanel);
        this.setSize(400 , 300);
        this.setLocation(750,350);
        this.setVisible(true);
    }


    public FactorialTaskForm() {
        calcutateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FactorialCalculator FactCalculator = new FactorialCalculator(textArea1.getText());

            }
        });
    }
}

