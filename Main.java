//CUNETA, FRANCE DARYL HERMIE N. BSCPE3

package midtermpractical;

import java.awt.EventQueue;

// MAIN CLASS - RUNS THE PROGRAM

public class Main {
 
	public static void main(String[] args) {
    			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//CALLS THE TITLE FRAME - TITLEFRAME CLASS
					//INSTANTIATE
					titleframe frame1 = new titleframe();
		        	frame1.setVisible(true);

				} 
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
