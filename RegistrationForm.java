import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame 
{
	JLabel lrno,lfnm,lcity,lstate,lg,laddr;
	JTextField trnm,tfnm;
	JComboBox city;
	JList state;
	JTextArea taddr;
	JPanel p1;
	public RegistrationForm(){
		
		super("Registration");
		setSize(400,400);
		setVisible(true);
		
		p1=new JPanel();
		add(p1);
		taddr=new JTextArea(5,4);
		String ct[]={"Pune","Mumbai"};
		city=new JComboBox(ct);
		
		String st[]={"Maharshtra","Punjab"};
		state=new JList(st);
		
		JLabel l=new JLabel(new ImageIcon("C:\\abc.jpg")); 
		p1.add(taddr);
		p1.add(city);
		p1.add(state);
	}
	public static void main(String args[]){
		new RegistrationForm();
	}
}
