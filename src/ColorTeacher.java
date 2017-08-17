import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JFrame f;
	JPanel p;
	JButton yellow;
	JButton red;
	JButton blue;
	JButton green;
	

	public static void main(String[] args) {
		ColorTeacher colorteacher = new ColorTeacher(); 
	}
	
	ColorTeacher(){
		f = new JFrame();
		p = new JPanel();
		yellow = new JButton();
		red = new JButton();
		blue = new JButton();
		green = new JButton();
		
		
		f.add(p);
		f.setVisible(true);
		p.add(yellow);
		p.add(red);
		p.add(blue);
		p.add(green);
		f.pack();
		
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		yellow.addActionListener(this);
		
		red.setBackground(Color.RED);
		red.setOpaque(true);
		red.addActionListener(this);
		
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		blue.addActionListener(this);
		
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		green.addActionListener(this);
	}
	
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		} catch(IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(yellow)){
		speak("Yellow");
		}
		if(e.getSource().equals(red)){
			speak("Red");
		}
		if(e.getSource().equals(blue)){
			speak("Blue");
		}
		if(e.getSource().equals(green)){
			speak("Green");
		}
	}

}
