/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 *
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the default package) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 *
	 */

	
	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());
		

		
		
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		frame.addMouseListener(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//int mX = e.getX();
		//int mY = e.getY();
		//System.out.println(backgroundImage.getRGB(mX, mY));
				loadImageFromWithinProject("what.jpg");
		//if(backgroundImage.getRGB(mX, mY) == -5067125){

		//}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public JLabel loadImageFromWithinProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}


