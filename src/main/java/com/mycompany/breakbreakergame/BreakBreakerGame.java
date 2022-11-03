/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.breakbreakergame;

/**
 *
 * @author viraj
 */
import javax.swing.JFrame;
public class BreakBreakerGame {

    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gameplay=new GamePlay();
        obj.setBounds(10, 10, 700 ,600);
        obj.setTitle( "BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}
