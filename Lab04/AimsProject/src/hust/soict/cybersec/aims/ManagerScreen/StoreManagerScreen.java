package hust.soict.cybersec.aims.ManagerScreen;

import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.store.Store;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class StoreManagerScreen extends JFrame {
    private static Store store;

    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");
        JMenuItem viewStore = new JMenuItem("View store");
        viewStore.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                switchStoreScreen();
            }
        });
        menu.add(viewStore);
        
        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add book");
        addBook.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                switchAddScreen(new AddBookToStoreScreen(store));
            }

        });
        smUpdateStore.add(addBook);

        JMenuItem addCD = new JMenuItem("Add CD");
        addCD.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                switchAddScreen(new AddCDToStoreScreen(store));
            }
        });
        smUpdateStore.add(addCD);

        JMenuItem addDVD = new JMenuItem("Add DVD");
        addDVD.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                switchAddScreen(new AddDVDToStoreScreen(store));
            }
        });
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    // Create method createHeader()
    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont( new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10,10)));
        return header;
    }
    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        
        if (!mediaInStore.isEmpty()) {
            for (int i = 0; i < 9; i++) {
                MediaStore cell = new MediaStore(mediaInStore.get(i));
                center.add(cell);
            }
        }
        return center;
        
    }
    //Add item to store
    public void switchStoreScreen(){
        getContentPane().removeAll();
        getContentPane().add(createCenter(), BorderLayout.CENTER);
        revalidate();
        repaint();

    }
    public void switchAddScreen(JPanel panel){
        getContentPane().add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public StoreManagerScreen(Store store){
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }
    
}
