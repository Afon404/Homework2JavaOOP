package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame implements WindowListener, ActionListener {

   private TextField f = new TextField();
   private JButton b0 = new JButton("0");
   private JButton b1 = new JButton("1");
   private JButton b2 = new JButton("2");
   private JButton b3 = new JButton("3");
   private JButton b4 = new JButton("4");
   private JButton b5 = new JButton("5");
   private JButton b6 = new JButton("6");
   private JButton b7 = new JButton("7");
   private JButton b8 = new JButton("8");
   private JButton b9 = new JButton("9");
   private JButton result = new JButton("=");
   private JButton ad = new JButton("+");
   private JButton  sub = new JButton("-");
   private JButton  multiply = new JButton("*");
   private JButton  divide = new JButton("/");
   private JButton del = new JButton("C");
   private JButton Cancel = new JButton("D");
   private JButton sq = new JButton("sqrt");
   private JButton change = new JButton("+/-");

   private String text="";
   private int a=0;
   private int b=0;
   private char z;


    public Window(){
     Font ex = new Font("Impact",Font.BOLD,40);
     setLayout(null);
     setSize(400,600);
     setVisible(true);
     setLocation(700,250);


      result.setFont(ex);
      result.setSize(65,155);
      result.setLocation(265,385);
      result.setVisible(true);
      result.addActionListener(this);
      add(result);


      sq.setSize(65,32);
      sq.setLocation(25,105);
      sq.setVisible(true);
      sq.addActionListener(this);
      add(sq);

      change.setSize(65,65);
      change.setLocation(25,465);
      change.setVisible(true);
      change.addActionListener(this);
      add(change);

      ad.setFont(ex);
      ad.setSize(65,65);
      ad.setLocation(25,145);
      ad.setVisible(true);
      ad.addActionListener(this);
      add(ad);

      multiply.setFont(ex);
      multiply.setSize(65,65);
      multiply.setLocation(185,145);
      multiply.setVisible(true);
      multiply.addActionListener(this);
      add(multiply);

      divide.setFont(ex);
      divide.setSize(65,65);
      divide.setLocation(265,145);
      divide.setVisible(true);
      divide.addActionListener(this);
      add(divide);

      sub.setFont(ex);
      sub.setSize(65,65);
      sub.setLocation(105,145);
      sub.setVisible(true);
      sub.addActionListener(this);
      add(sub);


      b0.setFont(ex);
      b0.setSize(65,65);
      b0.setLocation(105,465);
      b0.setVisible(true);
      b0.addActionListener(this);
      add(b0);

     f.setFont(ex);
     f.setSize(330,60);
     f.setLocation(25,25);
     f.setVisible(true);
     add(f);



      b9.setFont(ex);
      b9.setSize(65,65);
      b9.setLocation(25,225);
      b9.setVisible(true);
      b9.addActionListener(this);
      add(b9);

      b8.setFont(ex);
      b8.setSize(65,65);
      b8.setLocation(105,225);
      b8.setVisible(true);
      b8.addActionListener(this);
      add(b8);

      b7.setFont(ex);
      b7.setSize(65,65);
      b7.setLocation(185,225);
      b7.setVisible(true);
      b7.addActionListener(this);
      add(b7);

      b6.setFont(ex);
      b6.setSize(65,65);
     b6.setLocation(25,305);
     b6.setVisible(true);
     b6.addActionListener(this);
     add(b6);

     b5.setFont(ex);
     b5.setSize(65,65);
     b5.setLocation(105,305);
     b5.setVisible(true);
     b5.addActionListener(this);
     add(b5);

     b4.setFont(ex);
     b4.setSize(65,65);
     b4.setLocation(185,305);
     b4.setVisible(true);
     b4.addActionListener(this);
     add(b4);

     del.setFont(ex);
     del.setSize(65,65);
     del.setLocation(265,225);
     del.setVisible(true);
     del.addActionListener(this);
     add(del);

     Cancel.setFont(ex);
     Cancel.setSize(65,65);
     Cancel.setLocation(265,305);
     Cancel.setVisible(true);
     Cancel.addActionListener(this);
     add(Cancel);

     b3.setFont(ex);
     b3.setSize(65,65);
     b3.setLocation(25,385);
     b3.setVisible(true);
     b3.addActionListener(this);
     add(b3);

     b2.setFont(ex);
     b2.setSize(65,65);
     b2.setLocation(105,385);
     b2.setVisible(true);
     b2.addActionListener(this);
     add(b2);

     b1.setFont(ex);
     b1.setSize(65,65);
     b1.setLocation(185,385);
     b1.setVisible(true);
     b1.addActionListener(this);
     add(b1);






 }





    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()== b0){
          text = text + b0.getText();
          f.setText(text);
       }
       if (e.getSource()== b1){
          text = text + b1.getText();
          f.setText(text);
       }
       if (e.getSource()== b2){
          text = text + b2.getText();
          f.setText(text);
       }
       if (e.getSource()== b3){
          text = text + b3.getText();
          f.setText(text);
       }
       if (e.getSource()== b4){
          text = text + b4.getText();
          f.setText(text);
       }
       if (e.getSource()== b5){
          text = text + b5.getText();
          f.setText(text);
       }
       if (e.getSource()== b6){
          text = text + b6.getText();
          f.setText(text);
       }
        if (e.getSource()== b7){
           text = text + b7.getText();
           f.setText(text);
        }
       if (e.getSource()== b8){
          text = text + b8.getText();
          f.setText(text);
       }
       if (e.getSource()== b9){
          text = text + b9.getText();
          f.setText(text);
       }

       if (e.getSource()== del){
          text ="";
          f.setText(text);
       }
        if (e.getSource()== ad){
            a = Integer.parseInt(text);
            f.setText(text+ad.getText());
            text = "";
            z ='+';
        }
        if (e.getSource()== sub){
            a = Integer.parseInt(text);
            f.setText(text+sub.getText());
            text = "";
            z = '-';
        }
        if (e.getSource()== multiply){
            a = Integer.parseInt(text);
            f.setText(text+multiply.getText());
            text = "";
            z = '*';
        }
        if (e.getSource()== divide){
            a = Integer.parseInt(text);
            f.setText(text+divide.getText());
            text = "";
            z = '/';
        }
        if (e.getSource()== result){
            if (z=='+'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a+b));
            }
        }
        if (e.getSource()== result){
            if (z=='-'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a-b));
            }
        }
        if (e.getSource()== result){
            if (z=='*'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a*b));
            }
        }
        if (e.getSource()== result){
            if (z=='/'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a/b));
            }
        }
        if (e.getSource()== Cancel){
        int c = Integer.parseInt(f.getText());
        c=c/10;
        f.setText(String.valueOf(c));
        text=String.valueOf(c);
        }
        if (e.getSource()== change){
            int c = Integer.parseInt(f.getText());
            c=c*-1;
            f.setText(String.valueOf(c));
            text=String.valueOf(c);
        }
        if (e.getSource()== sq){
            double c = Integer.parseInt(f.getText());
            c=Math.sqrt(c);
            f.setText(String.valueOf(c));
            text=String.valueOf(c);

        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
