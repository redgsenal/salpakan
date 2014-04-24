package game.board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class BoardComponent extends JComponent {

	/**
	 * The graphics representation of the board
	 */
	private static final long serialVersionUID = 5329582526247502545L;

	public BoardComponent() {
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(10, 10, 800, 670);        
	}
	

}
