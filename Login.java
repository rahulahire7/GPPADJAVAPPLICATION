import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener{
	JFrame f1;
	JPanel p1;
	JLabel lunm,lpass;
	JTextField tunm;
	JPasswordField tpass;
	JButton blogin,breset;	
	GridLayout gl;

	public Login(){
		f1=new JFrame("Welcome");
		f1.setSize(400,400);
		f1.setVisible(true);
		
		gl=new GridLayout(3,2,5,5);
		f1.setLayout(gl);

		lunm=new JLabel("User Name");
		lpass=new JLabel("Password");

		tunm=new JTextField(10);
		tpass=new JPasswordField(10);

		blogin=new JButton("Login");
		breset=new JButton("Reset");	

		f1.add(lunm);
		f1.add(tunm);
		f1.add(lpass);
		f1.add(tpass);
		f1.add(blogin);
		f1.add(breset);	

		//register event
		blogin.addActionListener(this);
		breset.addActionListener(this);		
	tunm.setEditable(true);
	
	
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==blogin){
		
		String s1=tunm.getText();
			String s2=tpass.getText();
			if(s1.equals("admin"))
			{
				if(s2.equals("pass"))
				{
			System.out.println("Valid User:");			
				}
				
			}
		}
		if(e.getSource()==breset){
			tunm.setEditable(false);
			tunm.setText("Enter User Name");	
			tpass.setText("Enter Pass here");
		}
	}
	public static void main(String args[]){
		Login l=new Login();
	}
}