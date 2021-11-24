import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GUI2 extends JFrame implements ActionListener {
   Label lnum = new Label("-->");
   Button bto = new Button("RANDOM");
   Button bud = new Button("UP/DN");
   int updown = 1; // 1 for UP, 0 for down
   int n;
   String LottoOutput = " ";

   public void nup() {
      n++;
   }
   public void ndn() {
      n--;
   }
 
   public GUI2() 
   {
      super("My Beautiful Up & Down");
      lnum.setFont(new Font("Sans Serif", Font.PLAIN, 40));
      bto.setFont(new Font("Sans Serif", Font.PLAIN, 40));
      bud.setFont(new Font("Sans Serif", Font.PLAIN, 40));

      Panel p1 = new Panel();
      p1.setLayout(new GridLayout(2,3));
      p1.add(bto);
      // p1.add(bud);
      p1.add(lnum);
      bto.addActionListener(this);
      bud.addActionListener(this);
      add(p1);
      addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }

   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == bto) {
        int rr = (int)Math.floor(Math.random()*(46-1+1)+1);
        LottoOutput = LottoOutput + " " + rr;
         lnum.setText(LottoOutput);
      }
      // 6개만 표시하고, 이후에는 아무런 동작을 하지 않는다

      if(e.getSource() == bud) {
         if(updown == 0) ndn();  // down
         else if(updown == 1) nup();  // up
         lnum.setText("--> " + n);
      }
   }
           
   public static void main(String[] args) {
      GUI2 frame = new GUI2();
      frame.setSize(300,300);
      frame.setVisible(true);
   }
} 
