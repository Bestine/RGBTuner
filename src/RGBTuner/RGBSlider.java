package RGBTuner;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class RGBSlider implements ChangeListener{
	
	JSlider redSlider;
	JSlider greenSlider;
	JSlider blueSlider;
	
	JLabel redLabel;
	JLabel greenLabel;
	JLabel blueLabel;
	
	JPanel contentPanel;
	
	RGBSlider() {
		
		redSlider = new JSlider(0, 255, 0);
		redSlider.setPreferredSize(new Dimension(300, 300));
		redSlider.setOrientation(JSlider.VERTICAL);
		redSlider.addChangeListener(this);
		greenSlider = new JSlider(0, 255, 0);
		greenSlider.setPreferredSize(new Dimension(300, 300));
		greenSlider.setOrientation(JSlider.VERTICAL);
		greenSlider.addChangeListener(this);
		blueSlider = new JSlider(0, 255, 0);
		blueSlider.setPreferredSize(new Dimension(300, 300));
		blueSlider.setOrientation(JSlider.VERTICAL);
		blueSlider.addChangeListener(this);
		
		redLabel = new JLabel();
		redLabel.setText(redSlider.getValue()+" RED");
		greenLabel = new JLabel();
		greenLabel.setText(greenSlider.getValue()+" GREEN");
		blueLabel = new JLabel();
		blueLabel.setText(blueSlider.getValue()+" BLUE");
		
		contentPanel = new JPanel();
		contentPanel.setPreferredSize(new Dimension(900, 300));
		contentPanel.setBackground(new Color(
				redSlider.getValue(), 
				greenSlider.getValue(), 
				blueSlider.getValue()));
		
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 300, 350);
		redPanel.add(redSlider);
		redPanel.add(redLabel);
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(300, 0, 300, 350);
		greenPanel.add(greenSlider);
		greenPanel.add(greenLabel);
		JPanel bluePanel = new JPanel();
		bluePanel.setBounds(600, 0, 300, 350);
		bluePanel.add(blueSlider);
		bluePanel.add(blueLabel);
		
		JPanel colorSettingPanel = new JPanel();
		colorSettingPanel.setLayout(null);
		colorSettingPanel.setPreferredSize(new Dimension(900, 350));
		colorSettingPanel.add(redPanel);
		colorSettingPanel.add(greenPanel);
		colorSettingPanel.add(bluePanel);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("RGB tuner");
		frame.setSize(900, 700);
		
		frame.add(contentPanel, BorderLayout.NORTH);
		frame.add(colorSettingPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(
				e.getSource()==redSlider ||
				e.getSource()==greenSlider ||
				e.getSource()==blueSlider
				) {
			contentPanel.setBackground(new Color(
					redSlider.getValue(), 
					greenSlider.getValue(), 
					blueSlider.getValue()));
			//Change the labels values
			redLabel.setText(redSlider.getValue()+" RED");
			greenLabel.setText(greenSlider.getValue()+" GREEN");
			blueLabel.setText(blueSlider.getValue()+" BLUE");
		}
		
	}

}
