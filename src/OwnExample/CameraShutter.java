package OwnExample;
import javax.swing.*;
import java.awt.*;

public class CameraShutter {
    JFrame frame;

    public void go(){
        frame = new JFrame();


        Icon icon = new ImageIcon("src/OwnExample/shutter.jpg");
        JButton button = new JButton(icon);



            button.addActionListener(event ->
                    System.out.print("Фотограф счастлив\n"));

            button.addActionListener(event ->
                    System.out.print("Кадр удачный!\n"));

            button.addActionListener(event ->
                    System.out.println("Затвор сработал\n"));

        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(550,550);
        frame.setVisible(true);

    }

    }

