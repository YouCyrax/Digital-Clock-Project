
package com.mycompany.digitalclock;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main extends JFrame{
    JLabel jlabelClock;
    ClockThread clockThread;
    public main(){
        jlabelClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlabelClock);
        setSize(1200, 120);
        jlabelClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 80));
        jlabelClock.setOpaque(true);
        jlabelClock.setBackground(Color.black);
        jlabelClock.setForeground(Color.white);
        setLocationRelativeTo(null);
        clockThread = new ClockThread(this);
        setVisible(true);
    }
     public static void main(String[] args) {
        new main();
    }
}
