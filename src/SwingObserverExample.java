import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {

    JFrame frame;
    public void go(){
        frame = new JFrame();

        JButton button = new JButton("Следует ли мне делать это?");
        button.addActionListener(event ->
                System.out.println("Ангел на правом плече: Не делай это, тебе надо передумать!")
        );
        button.addActionListener(event ->
                System.out.println("Черт на левом плече: Давай, сделай это!")
        );
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}