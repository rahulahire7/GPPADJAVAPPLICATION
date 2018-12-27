import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator2 extends JFrame
{

	JTextField ta;
	JButton btn;
	
	JPanel p1,p2,p3;
	public Calculator2(){
		super("Calc_Ver  ");
		setSize(400,400);
		setVisible(true);

		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		
		p1=new JPanel();
		p2=new JPanel();
		ta=new JTextField(100);
		
		add(BorderLayout.NORTH,ta);
		add(BorderLayout.CENTER,p1);

		GridLayout gl=new GridLayout(3, 3);
		p1.setLayout(gl);
		for(int i=1;i<=9;i++){
			p1.add(new JButton(Integer.toString(i)));
		}
		
	}
	public static void main(String[] args) {
	
		new Calculator2();
	}

}
