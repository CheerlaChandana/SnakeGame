/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

/**
 *
 * @author chand
 */
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Snake extends JFrame{
    
    Snake(){
        
      add(new Board()) ;
      pack();
      setLocationRelativeTo(null);
      setResizable(false);
      setTitle("THE SNAKE GAME");
        
        
    }
    
    
    public static void main(String[] args){
        new Snake().setVisible(true);
        
        
        
        
        
        
    }
    
    
    
    
    
}
