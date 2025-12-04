
import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.lang.foreign.AddressLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameGUI extends JFrame{

	
	private JLabel l1,l2,l3,l4,l5;
	private JTextField t1,t2,t3,t4;
	private JButton b1;
	private JTextArea ta;
	private JPanel p1;
		
public GameGUI () {
			super ("Film");
			setSize(320,280);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(new GridLayout(0,2));

p1 = new JPanel();
p1.setLayout(new GridLayout(0, 2, 5, 5));
l1 = new JLabel("Naziv");
l2 = new JLabel("Helth 0-100");
l3 = new JLabel("x pozicija");
l4 = new JLabel("y pozicija");
l5 = new JLabel("Kolajder");
	       
JRadioButton rectBtn = new JRadioButton("Rectangle", true);
JRadioButton circleBtn = new JRadioButton("Circle");
ButtonGroup group = new ButtonGroup();
group.add(rectBtn);
group.add(circleBtn);

JButton startBtn = new JButton("Pokreni igru");

t1 = new JTextField(20);
t2 = new JTextField(20);
t3 = new JTextField(20);
t4 = new JTextField(20);
		
 JPanel p1 = new JPanel();
 p1.setLayout(new GridLayout(0, 2, 5, 5));
 p1.add(new JLabel("Ime:"));
 p1.add(t1);
 p1.add(new JLabel("Health 0–100:"));
 p1.add(t2);
 p1.add(new JLabel("X pozicija"));	       
 p1.add(t3);
 p1.add(new JLabel("Y pozicija"));
 p1.add(t4);
 p1.add(new JLabel("Kolajder:"));

 JTextArea output = new JTextArea();
 output.setEditable(false);
 JScrollPane scroll = new JScrollPane(output);
       
JPanel colPanel = new JPanel();
colPanel.add(rectBtn);
colPanel.add(circleBtn);
p1.add(colPanel);

JPanel bottom = new JPanel(new FlowLayout());
bottom.add(startBtn);

add(p1, BorderLayout.NORTH);
add(scroll, BorderLayout.CENTER);
add(bottom, BorderLayout.SOUTH);


add(p1);
add(scroll);
add(bottom);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GameGUI g = new GameGUI();
g.setVisible(true);
	}

}
