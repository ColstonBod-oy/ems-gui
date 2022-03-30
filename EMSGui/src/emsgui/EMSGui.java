/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emsgui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class EMSGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FontFormatException {
        Font font = Font.createFont(Font.TRUETYPE_FONT, EMSGui.class.getResourceAsStream("/emsgui/assets/I-pixel-u.ttf"));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        
        ImageLabel bg = new ImageLabel("bg.png", 780, 780, "", null, 0f);
        ImageLabel emblem = new ImageLabel("emblem.png", 195, 256, "", null, 0f);
        ImageLabel emblemText = new ImageLabel("", 0, 0, "EMS", font, 70f);
        EMSButton addEmployee = new EMSButton(250, 50, "Add Employee", font, 25f);
        EMSButton removeEmployee = new EMSButton(250, 50, "Remove Employee", font, 25f);
        EMSButton findEmployee = new EMSButton(250, 50, "Find Employee", font, 25f);
        EMSButton updateEmployee = new EMSButton(250, 50, "Update Employee", font, 25f);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(780, 780));
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.add(emblem, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.PAGE_START, 
                GridBagConstraints.NONE, new Insets(80, 0, 0, 0), 0, 0));
        mainPanel.add(emblemText, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(-10, 0, 0, 0), 0, 0));
        mainPanel.add(addEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(150, 0, 0, 0), 0, 0));
        mainPanel.add(removeEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(270, 0, 0, 0), 0, 0));
        mainPanel.add(findEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(390, 0, 0, 0), 0, 0));
        mainPanel.add(updateEmployee, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(510, 0, 0, 0), 0, 0));
        mainPanel.add(bg, new GridBagConstraints(0, 0, 3, 1, 0, 0, GridBagConstraints.CENTER, 
                GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        JFrame mainFrame = new JFrame("Sci-EMS");
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
    
}
