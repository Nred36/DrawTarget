/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawsmileytest;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author rkaune
 */
public class DrawSmiley extends JPanel {

    private double t = 1;

    /**
     * draws a target with a random colour for each ring
     * @param g
     */
    public void paintComponent(Graphics g) {
        for (int i = 0; i < 22; i++) {
            g.setColor(new Color((int) Math.ceil(Math.random() * 256 - 1), (int) Math.ceil(Math.random() * 256 - 1), (int) Math.ceil(Math.random() * 256 - 1)));
            g.fillOval(5 + i * 5, 10 + i * 5, 200 - i * 10, 200 - i * 10);
        }
        repaint();
    }
} // end class DrawSmiley
