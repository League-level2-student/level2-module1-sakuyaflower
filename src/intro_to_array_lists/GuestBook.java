package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GuestBook implements ActionListener {
	static JFrame JF = new JFrame();
	static JPanel JP = new JPanel();
	static JTextArea text = new JTextArea(7,7);

	static JButton JB = new JButton("Add Name");
	 static JButton button = new JButton("View Name");
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {

		JF.add(JP);
		JP.add(JB);
		JP.add(button);
		JP.add(text);
		JF.setVisible(true);
		JF.pack();
	}
	void setup() {
		JB.addActionListener(this);
		button.addActionListener(this);
ArrayList<String> names = new ArrayList<String>();		
		names.add("Guest #1: Bob Banders");
		names.add("Guest #2: Sandy Summers");
		names.add("Guest #3: Greg Ganders");
		names.add("Guest #4: Donny Doners");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		if( JB == buttonClicked ) {
			JOptionPane.showInputDialog("Please enter your name here");
		}
	if(button == buttonClicked) {
		
	}
	}
}
