//CUNETA, FRANCE DARYL HERMIE N. BSCPE3

package midtermpractical;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// TITLE FRAME - THE TITLE PAGE OF THE PROGRAM

public class titleframe extends JFrame implements ActionListener {

	JPanel panelmain;
	
	JLabel labeltitle;
	JLabel magnifyingpic;
	JLabel namelabel;
	
	JButton buttonenter;
	JButton buttonexit;
	JButton buttonabout;
	
	public titleframe() {
		setTitle("Search-A-Word");
		
			//FRAME
		panelmain = new JPanel();
			panelmain.setBackground(new Color(21, 79, 136));
			panelmain.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(panelmain);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(500, 50, 435, 656);
				panelmain.setLayout(null);		
		
			//LABEL
		labeltitle = new JLabel("Search-A-Word");
			labeltitle.setBounds(89, 114, 322, 145);
			labeltitle.setFont(new Font("Forte", Font.BOLD, 47));
			labeltitle.setForeground(new Color(255, 255, 255));
				panelmain.add(labeltitle);
								
		namelabel = new JLabel("by eugeo");
			namelabel.setForeground(new Color(255, 255, 255));
			namelabel.setFont(new Font("Segoe UI Emoji", Font.ITALIC, 14));
			namelabel.setBounds(298, 195, 189, 29);
				panelmain.add(namelabel);
				
			//PICTURE
		magnifyingpic = new JLabel("Magnifying Glass");
			magnifyingpic.setHorizontalAlignment(SwingConstants.CENTER);
			magnifyingpic.setIcon(new ImageIcon("C:\\Users\\france\\Desktop\\College 3rd Year\\1st Semester\\Data Structures and Algorithms\\midterm\\PhotoRoom_20230909_204656.png"));
			magnifyingpic.setBounds(10, 120, 133, 145);
				panelmain.add(magnifyingpic);
		
				
			//BUTTONS
		buttonenter = new JButton("Enter");
			buttonenter.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			buttonenter.setBounds(137, 248, 142, 48);
				panelmain.add(buttonenter);
					buttonenter.addActionListener(this); 
		
		buttonabout = new JButton("About");
			buttonabout.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			buttonabout.setBounds(137, 306, 142, 48);
				panelmain.add(buttonabout);
					buttonabout.addActionListener(this); 
				
		buttonexit = new JButton("Exit");
			buttonexit.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			buttonexit.setBounds(137, 364, 142, 48);
				panelmain.add(buttonexit);
					buttonexit.addActionListener(this);
						
	}
	
	
		//ACTION PERFORMED OF EACH BUTTON
	public void actionPerformed(ActionEvent e) {
		
			//EXIT BUTTON ACTION
		if (e.getSource() == buttonexit) {
			int answer = JOptionPane.showOptionDialog(null, "Do you want to exit from the program?", "Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
				if(answer==0) {
					System.exit(0);
				}
				if(answer==1) {
					return;
				}
			}
		
			//ENTER BUTTON ACTION
		if (e.getSource() == buttonenter) {
			
				//CALLS THE MAIN FRAME - INTERPOLATE CLASS
				//INSTANTIATE
        		interpolate frame2 = new interpolate();
        		frame2.setVisible(true);
        		this.setVisible(false);	

			}
		
			//ABOUT BUTTON ACTION
		if (e.getSource() == buttonabout) {
			int answer = JOptionPane.showOptionDialog(null, "   Search-A-Word is simple dictionary made by France Daryl Hermie N. Cuneta using\nInterpolation Search—a method of searching an element by narrowing down an array.", "About", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);

			}
	}
}
