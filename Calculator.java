import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

	JFrame f1;
	JPanel p1;
	
	JLabel lno1,lno2,lans;
	JTextField tno1,tno2,tans;
	JButton badd,breset;
	
	public Calculator() {
		
			f1=new JFrame("CalculatorVer2019");
			f1.setSize(400,400);
			f1.setVisible(true);
	
			p1=new JPanel();
			f1.add(p1);
			p1.setBackground(Color.CYAN);	
	
			GridLayout gl=new GridLayout(4,2,5,5);
			p1.setLayout(gl);
			
			Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,22);
			
			lno1=new JLabel("Number1");
			lno1.setFont(f1);
			lno2=new JLabel("Number2");
			lno2.setFont(f1);
			lans=new JLabel("ANS");
			lans.setFont(f1);
			
			lans.setForeground(Color.red);
			tno1=new JTextField(10);
			tno1.setToolTipText("Enter Number Only");
			tno2=new JTextField(10);
			tans=new JTextField(10);
			tans.setFont(f1);
			
			
			badd=new JButton("+");
			breset=new JButton("C");
			
			p1.add(lno1);
			p1.add(tno1);
			
			p1.add(lno2);
			p1.add(tno2);
			
			p1.add(lans);
			p1.add(tans);
			
			p1.add(badd);
			p1.add(breset);
			
			badd.addActionListener(this);
			breset.addActionListener(this);
			
	}
	public static void main(String[] args) {
		new Calculator();
	}
	public void actionPerformed(ActionEvent e) {
		
		String str=e.getActionCommand();
		
		if(str.equals("+")){
			
			String s1=tno1.getText();
			String s2=tno2.getText();
			
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			System.out.println(Math.sin(n1));
			int add=n1+n2;
			
			tans.setText(Integer.toString(add));
			tans.setEditable(false);
			
		}
		if(str.equals("C")){
			
			tno1.setText("");
			tno2.setText("");
			tans.setText("");
			
			
		}
		
	}
}
