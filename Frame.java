/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;
import javax.swing.JFrame;
import java.awt.Color;

/**
 *
 * @author user
 */
public class Frame extends JFrame{
    public Frame(){
        setTitle("First GUI");
        setSize(600, 700);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        pack();
        setVisible(true);
    }
}
