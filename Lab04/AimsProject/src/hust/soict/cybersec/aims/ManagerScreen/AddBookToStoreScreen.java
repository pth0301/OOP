package hust.soict.cybersec.aims.ManagerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.store.Store;

public class AddBookToStoreScreen extends AddItemsToStoreScreen {
    private static final JTextComponent AuthorArea = null;
    private JTextArea authorArea;
    private JButton addButton;
    public AddBookToStoreScreen(Store store) {
        super(store);

        JLabel authorLabel = new JLabel("Authors:");
        authorArea = new JTextArea(5, 20);
        JScrollPane authorScrollPane = new JScrollPane(authorArea);

        addButton = new JButton("Add Book");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItemToStore(); // Call abstract method when the button is clicked
                JOptionPane.showMessageDialog(null,"New Book has been added");
            }
        });

        center.add(authorLabel, labelConstrains);
        center.add(authorScrollPane, fieldConstrains);
        center.add(addButton,fieldConstrains);

    }
    @Override
    protected void addItemToStore() {
        String title = titleField.getText();
        String category = categoryField.getText();
        float cost = Float.parseFloat(costField.getText());
        String[] authorsArray = authorArea.getText().split("\n");
        List<String> authorsList = new ArrayList<>();
        for (String author : authorsArray) {
            authorsList.add(author);
        }

        Book book = new Book(title, category, cost, authorsList);
        store.addMedia(book);
        titleField.setText("");
        categoryField.setText("");
        costField.setText("");
        AuthorArea.setText("");
    }

    public static void main(String[] args) {
        Store store = new Store();
        AddBookToStoreScreen addBookScreen = new AddBookToStoreScreen(store);
        addBookScreen.setVisible(true);
    }
}
