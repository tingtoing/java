import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener {
	Label n1 = new Label("Label 1");
	Button b1 = new Button("UP");
	Button b2 = new Button("DOWN");
	Button b3 = new Button("RESET");
	int i = 0;

	public GUI()
 {
	super("GUI 1-simple");
	 Panel p1 = new Panel();
	 p1.setLayout(new GridLayout(2,3));
	 p1.add(n1);
	 p1.add(b1);
	 p1.add(b2);
	 p1.add(b3);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 add(p1);
	 addWindowListener(new WindowAdapter(){
	 public void windowClosing(WindowEvent e) {
	 System.exit(0);
		 }
	 });
 }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("button pressed");
			n1.setText("pressed!!!! --> " + i++);
		}
		else if(e.getSource()==b2) {
			System.out.println("button pressed");
			n1.setText("pressed!!!! --> " + --i);
		}
		else {
			System.out.println("button pressed");
			n1.setText("pressed!!!! --> " + 0);
			i=0;
		}
	}

	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
