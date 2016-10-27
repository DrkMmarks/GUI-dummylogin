package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class GUI extends JFrame
{
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	private JPasswordField password;
	
	public GUI()
	{
		setLayout(new FlowLayout());
		
		label = new JLabel("Admin Log in");
		add(label);
		
		textfield = new JTextField(15);
		add(textfield);
		
		password = new JPasswordField(15);
		add(password);
		
		
		button = new JButton("Enter");
		add(button);
		
		event e = new event();
		button.addActionListener(e);
		
		
	}
	public class event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			label.setText("Invalid Login!Try Again");
		}
	}
	public static void main (String args[])
	{
		GUI guiwin = new GUI();
		guiwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiwin.setSize(200, 200);
		guiwin.setVisible(true);
		guiwin.setTitle("Admin Win");
		
	}
}