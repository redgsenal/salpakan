package play;

import game.board.BoardComponent;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import utils.Constant;

public final class PlayFrame extends JFrame {

	private static final long serialVersionUID = -4349356628297597503L;
	private static final BoardComponent bc = new BoardComponent();
	public PlayFrame() {
		this.setSize(new Dimension(960, 720));
		this.setLocationRelativeTo(null);
		this.setTitle(Constant.GAME_TITLE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.add(bc, BorderLayout.CENTER);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void repaint() {
		bc.repaint();
		super.repaint();
	}
}
