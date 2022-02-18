package hello;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TrafficLight  extends JFrame implements ActionListener {
	JLabel label;
	JTextField display;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	Container c;
	TrafficLight(){
		setLayout(new FlowLayout());
		c=getContentPane();
		label=new JLabel(" Traffic Light");
		display =new JTextField(20);
		r1=new JRadioButton("Red");
		r2=new JRadioButton("Yellow");
		r3=new JRadioButton("Green");
		bg=new ButtonGroup();
		c.add(label);
		c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(display);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		c.setBackground(Color.white);
	}
	public void actionPerformed(ActionEvent ie)
	{
		if(ie.getSource()==r1)
		{
			c.setBackground(Color.red);
			display.setText("RED : TURNED ON");
		}
		else if (ie.getSource()==r2)
		{
			c.setBackground(Color.yellow);
			display.setText("YELLOW : TURNED ON");
		}
		else if (ie.getSource()==r3)
		{
			c.setBackground(Color.green);
			display.setText("GREEN : TURNED ON");
		}
	}
	public static void main(String[] args) {
	       new TrafficLight ();
	}
}
