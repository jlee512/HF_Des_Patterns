package Observer_Pattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Julian on 18/08/2017.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main (String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        //The JButton will be our subject that is being 'observed'
        JButton button = new JButton("Should I do it?");
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());
        //Lambda expression alternative
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    //actionPerformed is analogous to the 'update' method from previous examples
    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
