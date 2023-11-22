package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIInterface {
    private JFrame frame;
    private JPanel panel;
    private JButton viewInventoryButton;
    private JButton addProductButton;
    private JButton processOrderButton;

    public GUIInterface() {
        // Create and setup the window
        frame = new JFrame("Inventory Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel with layout
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create and add buttons
        viewInventoryButton = new JButton("View Inventory");
        addProductButton = new JButton("Add New Product");
        processOrderButton = new JButton("Process Order");

        // Add action listeners for buttons
        viewInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for viewing inventory
            }
        });

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for adding a new product
            }
        });

        processOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for processing an order
            }
        });

        // Add buttons to the panel
        panel.add(viewInventoryButton);
        panel.add(addProductButton);
        panel.add(processOrderButton);

        // Add the panel to the main window
        frame.add(panel);

        // Display the window
        frame.setVisible(true);
    }

    public void display() {
        // This method can be used to display or refresh the GUI
    }
}
