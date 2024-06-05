package hust.soict.cybersec.aims.ManagerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.Track;
import hust.soict.cybersec.aims.store.Store;


public class AddCDToStoreScreen extends AddItemsToStoreScreen {
    private JTextField artistField;
    private JButton addButton;
    private JButton addTrackButton;
    private JPanel trackPanel;

    private ArrayList<TrackPanel> trackPanels;
    private class TrackPanel extends JPanel {
        private JTextField trackNameField, lengthField;

        public TrackPanel() {
            trackNameField = new JTextField(20);
            lengthField = new JTextField(10);

            add(new JLabel("Track Name:"));
            add(trackNameField);
            add(new JLabel("Length:"));
            add(lengthField);
        }
        public String getTrackName() {
            return trackNameField.getText();
        }
        public int getLength() {
            try {
                return Integer.parseInt(lengthField.getText());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public AddCDToStoreScreen(Store store) {
        super(store);

        JLabel artistLabel = new JLabel("Artist: ");
        artistField = new JTextField(20);

        trackPanel = new JPanel();
        trackPanel.setLayout(new BoxLayout(trackPanel, BoxLayout.Y_AXIS));
        trackPanels = new ArrayList<>();

        center.add(artistLabel, labelConstrains);
        center.add(artistField, fieldConstrains);

        center.add(new JLabel("Tracks:"), labelConstrains);
        center.add(trackPanel, fieldConstrains);

        addTrackButton = new JButton("Add Track");
        addTrackButton.addActionListener((ActionEvent e) -> {
            addTrack(); 
        });

        center.add(addTrackButton, fieldConstrains);

        addButton = new JButton("Add CD");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItemToStore(); // Call abstract method when the button is clicked
                JOptionPane.showMessageDialog(null,"New CD has been added");            }
        });

        center.add(addButton, fieldConstrains);

    }

    private void addTrack() {
        TrackPanel newTrackPanel = new TrackPanel();
        trackPanel.add(newTrackPanel);
        trackPanels.add(newTrackPanel);
        trackPanel.revalidate();
        trackPanel.repaint();
    }


    @Override
    protected void addItemToStore() {
        String title = titleField.getText();
        String category = categoryField.getText();
        float cost = Float.parseFloat(costField.getText());
        String artist = artistField.getText();

        ArrayList<Track> tracks = new ArrayList<>();

        // Retrieve track information from each track panel
        for (TrackPanel trackPanel : trackPanels) {
            String trackName = trackPanel.getTrackName();
            int length = trackPanel.getLength();
            tracks.add(new Track(trackName, length));
        }

        CompactDisc CD = new CompactDisc(title, category, cost, artist, tracks);
        store.addMedia(CD);store.addMedia(CD);
        titleField.setText("");
        categoryField.setText("");
        costField.setText("");
        artistField.setText("");
        trackPanels.clear();
    }

    public static void main(String[] args) {
        Store store = new Store();
        AddCDToStoreScreen addCDScreen = new AddCDToStoreScreen(store);
        addCDScreen.setVisible(true);
    }
}
