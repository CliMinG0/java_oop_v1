package com.swing;

import javax.swing.*;

public class BorderLayout extends JFrame {

    public BorderLayout(){
        setTitle("Layout테스트");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args){
        new BorderLayout();
    }
}
