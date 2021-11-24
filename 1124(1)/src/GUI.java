import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener {
	Label n1 = new Label("Label 1");
	Button b1 = new Button("lotto");

	public GUI() {
		super("GUI 1-simple");
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 3));
		p1.add(n1);
		p1.add(b1);
		b1.addActionListener(this);
		add(p1);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		int j = (int) (Math.random() * 45);
		n1.setText("pressed!!!! --> " + j);
		System.out.println(j);

	}

	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}