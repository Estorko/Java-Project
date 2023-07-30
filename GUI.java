import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Test Frame");
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,400));
        
        final JTextArea textArea = new JTextArea(10, 40);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Click Me");
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button was clicked\n");
                
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}
