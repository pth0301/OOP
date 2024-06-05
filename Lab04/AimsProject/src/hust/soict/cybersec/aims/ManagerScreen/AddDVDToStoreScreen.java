package hust.soict.cybersec.aims.ManagerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.Store;

public class AddDVDToStoreScreen extends AddItemsToStoreScreen{
    private JTextField lengthField;
    private JTextField directorField;
    private JButton addButton;
    public AddDVDToStoreScreen(Store store) {
        super(store);

        JLabel lengthLabel = new JLabel("Length:");
        lengthField = new JTextField(20);

        JLabel directorLabel = new JLabel("Director:");
        directorField = new JTextField(20);

        addButton = new JButton("Add DVD");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItemToStore();
                JOptionPane.showMessageDialog(null,"New DVD has been added");;
            }
        });

        center.add(lengthLabel, labelConstrains);
        center.add(lengthField, fieldConstrains);
        center.add(directorLabel, labelConstrains);
        center.add(directorField, fieldConstrains);
        center.add(addButton, fieldConstrains);

    }

    @Override
    protected void addItemToStore() {
        String title = titleField.getText();
        String category = categoryField.getText();
        float cost = Float.parseFloat(costField.getText());
        int length = Integer.parseInt(lengthField.getText());
        String director = directorField.getText();

        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        store.addMedia(dvd);
        titleField.setText("");
        categoryField.setText("");
        directorField.setText("");
        lengthField.setText("");
        costField.setText("");

    }
    public static void main(String[] args) {
        Store store = new Store();
        AddDVDToStoreScreen addDVDScreen = new AddDVDToStoreScreen(store);
        addDVDScreen.setVisible(true);
    }
}
