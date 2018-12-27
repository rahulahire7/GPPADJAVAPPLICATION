import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorderLayout {
	
	JFrame f1;
	JButton b1,b2,b3,b4,b5;
	public TestBorderLayout(){
	
		f1=new JFrame("");
		f1.setSize(400,400);
		f1.setVisible(true);
		
		BorderLayout bl=new BorderLayout();
		f1.setLayout(bl);
		
		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
		b4=new JButton("Four");
		b5=new JButton("Five");
		
		f1.add(BorderLayout.NORTH,b1);
		f1.add(BorderLayout.SOUTH,b2);
		f1.add(BorderLayout.CENTER,b3);
		f1.add(BorderLayout.EAST,b4);
		f1.add(BorderLayout.WEST,b5);
		
		
		
	}
	
	public static void main(String[] args) {
	new TestBorderLayout();
	}

}
