package game.board;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import utils.Constant;
import utils.X;

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
        g2d.setColor(new Color(165, 165, 165));
        g2d.fillRect(Constant.BOARD_MARGIN, Constant.BOARD_MARGIN, Constant.BOARD_COMPONENT_WIDTH, Constant.BOARD_COMPONENT_HEIGHT);
        g2d.setColor(Color.BLACK);
        // draw vertical lines
        int xsep = Math.round((Constant.BOARD_COMPONENT_WIDTH / (Constant.MAX_BOARD_X - 1)));
        int xwidth = xsep;
        X.log(xwidth);
        for (int x = 1; x < Constant.MAX_BOARD_X - 1; x++){
        	int xline = xwidth * x;
        	X.log(xline);
        	g2d.fillRect(xline, Constant.BOARD_MARGIN, Constant.BOARD_LINE_WIDTH, Constant.BOARD_COMPONENT_HEIGHT);
        }
        
        
	}
}
