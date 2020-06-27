package play;

public class PlayOn {

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
		
		
	}

	protected static void createAndShowGUI() {
		PlayFrame pf = new PlayFrame();
		pf.setVisible(true);		
	}

}
