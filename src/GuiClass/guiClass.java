package GuiClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guiClass extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 4);
    private JLabel label = new JLabel("Input");
    private JRadioButton radion1 = new JRadioButton("Select 1");
    private JRadioButton radion2 = new JRadioButton("Select 2");
    private JCheckBox check = new JCheckBox("Click", false);

    public guiClass(){
        super("Simple Example");
        this.setBounds(100, 100, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,3,3,3));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radion1);
        group.add(radion2);
        radion1.setSelected(true);
        container.add(radion2);
        container.add(check);
        button.addActionListener(new ButtonEventLister());
        container.add(button);
    }

    class ButtonEventLister implements ActionListener{
        public void actionPerformed (ActionEvent r){
            String massage = "";
            massage += "Button was pressed\n";
            massage += "Text is " + input.getText() + "\n";
            massage += (radion1.isSelected() ? "Radion #1" : "Radion #2") + " is selected";
            massage += "Checkbox is " + ((check.isSelected() ? "checked" : "unchecked"));
            JOptionPane.showMessageDialog(null, massage, "Out", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
