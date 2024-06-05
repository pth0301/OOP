package SwingGUI;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame{
    private JButton[] btnNumbers = new JButton[10]; // array for the digit buttons
    private JButton btnDelete, btnReset; // button for DEL , reset
    private JTextField tfDisplay; // top display

    public NumberGrid(){
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(
            ComponentOrientation.RIGHT_TO_LEFT);// text and other elements are displayed from right to left
        JPanel panelButtons = new JPanel(new GridLayout(4,3));
        addButtons(panelButtons);

        Container cp = getContentPane(); // group all of the buttons and put them in a grid layout
        cp.setLayout(new BorderLayout()); // borderlayout - north, west, east, center,south
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);


    }
    void addButtons(JPanel panelButtons){
        ButtonListener btnListener = new ButtonListener();
        for (int  i = 1; i <= 9; i ++){
            btnNumbers[i] = new JButton("" + i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }
            btnDelete = new JButton("DEL");
            panelButtons.add(btnDelete);
            btnDelete.addActionListener(btnListener);

            btnNumbers[0] = new JButton("0");
            panelButtons.add(btnNumbers[0]);
            btnNumbers[0].addActionListener(btnListener);

            btnReset = new JButton("C");
            panelButtons.add(btnReset);
            btnReset.addActionListener(btnListener);
    }
    // the buttinListener class is capable of listneing for responding to action events such as when a button is clicked
    public class ButtonListener implements ActionListener{
        @Override
        // this method is called when an action event occurs
        public void actionPerformed(ActionEvent e){
            // correspondings to the text displayed on the button that trigger the event
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <= '9'){
                tfDisplay.setText(tfDisplay.getText() + button);
            }
            else if (button.equals("DEL")){
                // handles the "DEL" case
                String currentText = tfDisplay.getText();
                if (currentText.length() > 0){
                    // remove the last character from the text displayed in a TextField
                    tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
            else{
                //handles the "C" case
                String currentText = tfDisplay.getText();
                if (currentText.length() > 0){
                    // remove all characters drom the text displayed
                    tfDisplay.setText("");
                }
            }
        }
            
    }
    public static void main(String[] args){
        new NumberGrid();
    }
}
