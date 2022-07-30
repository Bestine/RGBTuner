package RGBTuner;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class RGBSlider implements ChangeListener{
	
	JSlider redSlider;
	JSlider greenSlider;
	JSlider blueSlider;
	
	RGBSlider() {
		
		redSlider = new JSlider(0, 255, 0);
		greenSlider = new JSlider(0, 255, 0);
		blueSlider = new JSlider(0, 255, 0);
		
		JPanel redPanel = new JPanel();
		JPanel greenPanel = new JPanel();
		JPanel bluePanel = new JPanel();
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setTitle("RGB tuner");
		frame.setSize(900, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
