package hust.soict.cybersec.aims.ManagerScreen;

import java.awt.*;

import javax.swing.*;

import hust.soict.cybersec.aims.store.Store;

public abstract class AddItemsToStoreScreen extends JPanel{
    protected Store store;
    protected JTextField idField, titleField, categoryField, costField;
    protected JPanel center = new JPanel();
    protected GridBagConstraints labelConstrains = new GridBagConstraints();
    protected GridBagConstraints fieldConstrains = new GridBagConstraints();
    public AddItemsToStoreScreen(Store store) {
        this.store = store;
        center.setLayout(new GridBagLayout());

        labelConstrains.gridwidth = 1;
        labelConstrains.gridx = 0;
        labelConstrains.gridy = GridBagConstraints.RELATIVE;
        labelConstrains.anchor = GridBagConstraints.EAST;
        labelConstrains.insets = new Insets(2, 2, 2, 2);

        fieldConstrains.gridwidth = GridBagConstraints.REMAINDER;
        fieldConstrains.gridx = 1;
        fieldConstrains.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Title: ");
        titleField = new JTextField(20);

        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField(20);

        JLabel costLabel = new JLabel("Cost:");
        costField = new JTextField(20);

        center.add(idField, fieldConstrains);
        center.add(titleLabel, labelConstrains);
        center.add(titleField, fieldConstrains);
        center.add(categoryLabel, labelConstrains);
        center.add(categoryField, fieldConstrains);
        center.add(costLabel, labelConstrains);
        center.add(costField, fieldConstrains);

        add(center, BorderLayout.CENTER);


    }
    protected void addItemToStore(){

    };
}