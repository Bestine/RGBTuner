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
		redSlider.setPreferredSize(new Dimension(300, 300));
		greenSlider = new JSlider(0, 255, 0);
		greenSlider.setPreferredSize(new Dimension(300, 300));
		blueSlider = new JSlider(0, 255, 0);
		blueSlider.setPreferredSize(new Dimension(300, 300));
		
		JLabel redLabel = new JLabel();
		redLabel.setText(" "+redSlider.getValue()+"°C");
		JLabel greenLabel = new JLabel();
		greenLabel.setText(" "+greenSlider.getValue()+"°C");
		JLabel blueLabel = new JLabel();
		blueLabel.setText(" "+blueSlider.getValue()+"°C");
		
		JPanel contentPanel = new JPanel();
		contentPanel.setPreferredSize(new Dimension(900, 350));
		contentPanel.setBackground(new Color(1, 4, 67));
		
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 300, 350);
		redPanel.setBackground(Color.red);
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(300, 0, 300, 350);
		greenPanel.setBackground(Color.green);
		JPanel bluePanel = new JPanel();
		bluePanel.setBounds(600, 0, 300, 350);
		bluePanel.setBackground(Color.blue);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(null);
		southPanel.setPreferredSize(new Dimension(900, 350));
		southPanel.add(redPanel);
		southPanel.add(greenPanel);
		southPanel.add(bluePanel);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("RGB tuner");
		frame.setSize(900, 700);
		
		frame.add(contentPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
