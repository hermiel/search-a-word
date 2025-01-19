//CUNETA, FRANCE DARYL HERMIE N. BSCPE3

//REFERENCES
	//Bro Code. Bro Code. (2021, October 17). Learn Interpolation search in 8 minutes. Youtube. URL https://www.youtube.com/watch?v=YSVS5GG1JuI
	//John. Coding with John. (2021, June 14). Map and HashMap in Java - Full Tutorial. Youtube. URL https://www.youtube.com/watch?v=H62Jfv1DJlU
	//Prashant Sharma. Prashant Sharma. (2020, November 16). Beginners | Interactive Dictionary using Java | Java Mini Project. Youtube. URL https://www.youtube.com/watch?v=GJczOo3tKs8&t=558s

package midtermpractical;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

// MAIN FRAME - THE DICTIONARY ITSELF or THE MAIN PROGRAM

class entry {
    String word;
    String definition;
    String determiner;
    String sentence;

    public entry(String word, String determiner, String definition, String sentence) {
        this.word = word;
        this.determiner = determiner;
        this.definition = definition;
        this.sentence = sentence;
    }
}

public class interpolate extends JFrame implements ActionListener {
    
    entry[] dictionary;
    
    JPanel panelmain; 
    JPanel panelA;
    JPanel panelB;
    
    JTextField searchfield;

    JTextArea searcharea;
    JTextArea definitionarea;
    JTextArea determinerarea;
    JTextArea sentencearea;
    
    JLabel title;
    JLabel enterlabel;
    JLabel magnifyingpic;
    JLabel labelname;
    
    JButton searchbutton;
    JButton clearbutton;
    JButton exitbutton;


    public interpolate() {
        
    	//DICTIONARY ENTRIES CONSISTING THE WORD, DETERMINER, DEFINITION, AND SAMPLE SENTENCE
    	dictionary = new entry[]{
                new entry("apple", "noun", "A red—sometimes green—sweet fruit." , "An apple fell on Newton's head."),
                new entry("boat", "noun","A small watercraft on water.", "The boat is sinking."),
                new entry("crown", "noun", "A headdress worn by a King or Queen." , "The Queen's crown is made of gold."),
                new entry("draw", "verb", "An action of creating a figure by making lines with a pencil" , "Her drawing of Jennie Kim is realistic."),
                new entry("empathy", "noun", "The action of understanding thoughts and feelings of others." , "He feels empathy towards his friend."),
                new entry("frown", "verb", "A facial expression that shows disappointment." , "He frowned when he got low marks."),
                new entry("ɡhost", "noun", "A dead person's spirit." , "This house is filled with ghosts."),
                new entry("happy", "adjective", "A positive feeling of contentment and satisfaction." , "He was so happy when they got together."),
                new entry("invisible", "adjective", "The ability to not be seen by an eye." , "I want to become invisible in times of embarrassment."),
                new entry("jump", "verb", "The ability to spring aboveground." , "She jumped when she won the lottery."),
                new entry("karma", "noun", "A belief that an action has a corresponding consequences." , "He received bad karma because he's a ban person."),
                new entry("love", "noun", "A deep affection towards a person or object." , "I love Taylor Swift."),
                new entry("move", "verb", "An action of moving from one place to another" , "He moved from Italy to Japan."),
                new entry("never", "adverb", "Means that a certain thing will not happen.", "I will never go ack again."),
                new entry("open", "adjective", "Allows access to a certain thing." , "The school is open tomorrow."),
                new entry("pencil", "noun", "An object that is used to make lines." , "The pencil is color yellow."),
                new entry("queue", "noun", "A line of people or object." , "The queue to the booth was long."),
                new entry("roll", "verb", "An action of turning over." , "The log rolled over the mountain."),
                new entry("see", "verb", "The ability to have a sense of sight." , "I can see you."),
                new entry("turn", "verb", "Moving from different direction." , "She turned left at the hall."),
                new entry("umbrella", "noun", "An instrument used to cover from rain or sun." , "I left my umbrella at home."),
                new entry("vase", "noun", "A container that is used with decorative design for flowers." , "The vase has exquisite design."),
                new entry("water", "noun", "A colorless liquid." , "The water from the beach is cold."),
                new entry("xylophone", "noun", "An instrument used to create music." , "The xylophone was loud."),
                new entry("yogurt", "noun", "A food that is semi-solid made from milk that are fermented." , "I eat yogurt every morning."),
                new entry("zygote", "noun", "A ovum that is fertilized" , "The zygote is cute."),

        };

    	//THE PART THAT COMPARES THE WORD WITH ANOTHER
        Arrays.sort(dictionary, (firstentry, secondentry) -> firstentry.word.compareTo(secondentry.word));

        
        	//MAIN PANEL
		setTitle("Search-A-Word");

		panelmain = new JPanel();
			panelmain.setBackground(new Color(21, 79, 136));
			panelmain.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(panelmain);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(500, 50, 435, 656);
			panelmain.setLayout(null);
			
		title = new JLabel("Search-A-Word");
			title.setFont(new Font("Forte", Font.BOLD, 41));
			title.setForeground(new Color(255, 255, 255));
			title.setBounds(107, 31, 275, 77);
				panelmain.add(title);

		
			//SUB PANELS		
        panelA = new JPanel();
        	panelA.setBackground(new Color(17, 121, 166));
        	panelA.setBounds(25, 118, 370, 104);
        	panelA.setLayout(null);
        		getContentPane().add(panelA);
        		
        panelB = new JPanel();
        	panelB.setBackground(new Color(167, 215, 220));
            panelB.setBounds(25, 243, 370, 319);
            panelmain.add(panelB);
            	panelB.setLayout(null); 
           
             	
            //SEARCH FIELD
        searchfield = new JTextField(20); // WHERE THE VALUE IS SEARCHED
            searchfield.setBackground(new Color(167, 215, 220));
            searchfield.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
            searchfield.setBounds(24, 38, 172, 38);
                panelA.add(searchfield);
        
                
            //LABELS
        enterlabel = new JLabel("Enter a word: ");
        	enterlabel.setBackground(new Color(255, 255, 255));
        	enterlabel.setForeground(new Color(255, 255, 255));
        	enterlabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
        	enterlabel.setBounds(24, 10, 154, 29);
        		panelA.add(enterlabel);
        		
		labelname = new JLabel("by eugeo");
			labelname.setForeground(new Color(255, 255, 255));
			labelname.setFont(new Font("Segoe UI Emoji", Font.ITALIC, 13));
			labelname.setBounds(292, 75, 167, 27);
				panelmain.add(labelname);
        		
        magnifyingpic = new JLabel("New label");
    		magnifyingpic.setIcon(new ImageIcon("C:\\Users\\france\\Desktop\\College 3rd Year\\1st Semester\\Data Structures and Algorithms\\midterm\\PhotoRoom_20230909_204656.png"));
    		magnifyingpic.setHorizontalAlignment(SwingConstants.CENTER);
    			magnifyingpic.setBounds(34, 30, 119, 104);
    				panelmain.add(magnifyingpic);
             	
             	
            //TEXT AREAS
        searcharea = new JTextArea(); // WHERE THE WORD IS PRINTED OUT
            searcharea.setBackground(new Color(167, 215, 220));
            searcharea.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
            searcharea.setEditable(false);
            searcharea.setBounds(25, 22, 313, 31);
            	panelB.add(searcharea);
        
    	determinerarea = new JTextArea(); // WHERE THE DETERMINER IS PRINTED OUT
    		determinerarea.setBackground(new Color(167, 215, 220));
    		determinerarea.setFont(new Font("Myanmar Text", Font.ITALIC, 14));
    		determinerarea.setEditable(false);
    		determinerarea.setBounds(25, 54, 129, 22);
    			panelB.add(determinerarea);
        
    	definitionarea = new JTextArea(); // WHERE THE DEFINITION IS PRINTED OUT
        	definitionarea.setBackground(new Color(167, 215, 220));
        	definitionarea.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
        	definitionarea.setEditable(false);
        	definitionarea.setBounds(25, 86, 319, 100);
        	definitionarea.setLineWrap(true);
        	definitionarea.setRows(5);
        	definitionarea.setWrapStyleWord(true);
        		panelB.add(definitionarea);
        
        sentencearea = new JTextArea(); // WHERE THE EXAMPLE SENTENCE IS PRINTED OUT
    		sentencearea.setBackground(new Color(167, 215, 220));
    		sentencearea.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
    		sentencearea.setEditable(false);
    		sentencearea.setBounds(25, 196, 319, 101);
    		sentencearea.setLineWrap(true);
    		sentencearea.setRows(5);
    		sentencearea.setWrapStyleWord(true);
    			panelB.add(sentencearea);
        
        		
        	//BUTTONS
        searchbutton = new JButton("Search");
        	searchbutton.setForeground(new Color(255, 255, 255));
            searchbutton.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
            searchbutton.setBackground(new Color(175, 215, 224));
            searchbutton.setBounds(201, 38, 73, 38);
            	panelA.add(searchbutton);
        			searchbutton.addActionListener(this); 

            	
        clearbutton = new JButton("Clear");
        	clearbutton.setBounds(273, 38, 73, 38);
        	clearbutton.setForeground(new Color(255, 255, 255));
        	clearbutton.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
        	clearbutton.setBackground(new Color(175, 215, 224));
        		panelA.add(clearbutton);
            		clearbutton.addActionListener(this); 

					
		exitbutton = new JButton("Exit");
			exitbutton.setForeground(new Color(219, 219, 219));
			exitbutton.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
			exitbutton.setBackground(new Color(85, 155, 185));
			exitbutton.setBounds(316, 572, 79, 31);
				panelmain.add(exitbutton);
					exitbutton.addActionListener(this); 
			
    }
			
			
    		//ACTION PERFORMED OF EACH BUTTONS
		public void actionPerformed(ActionEvent e) {
			
				//EXIT BUTTON ACTION
				if (e.getSource() == exitbutton) {
					int answer = JOptionPane.showOptionDialog(null, "Do you want to exit from the program?", "Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
						if(answer==0) {
							System.exit(0);
						}
						if(answer==1) {
							return;
						}
					}
		 
				//CLEAR BUTTON ACTION
				if (e.getSource() == clearbutton) {
				
					//FILLS THE TEXT AREAS WITH BLANKS
					searchfield.setText("");
					searcharea.setText("");
					determinerarea.setText("");
					definitionarea.setText("");
					sentencearea.setText("");

					JOptionPane.showMessageDialog(null, "Cleared Successfully!", "Clear", JOptionPane.INFORMATION_MESSAGE);
					}	
    
				//SEARCH BUTTON ACTION
				if (e.getSource() == searchbutton) {
					String searchWord = searchfield.getText().trim();

					int index = interpolationSearch(dictionary, searchWord);

					if (index != -1) {
						entry searched = dictionary[index];
						searcharea.setText(searched.word);
						determinerarea.setText(searched.determiner);
						definitionarea.setText("Definition:\n" + "   " + searched.definition);
						sentencearea.setText("Example Sentence:\n" + "   " + searched.sentence);
						
						}
	
					else if (searchfield.getText().toString().isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter a word.", "Invalid", JOptionPane.ERROR_MESSAGE);
					}
					
					else {
						JOptionPane.showMessageDialog(null, "The word you entered is either invalid or has not yet been added.", "Invalid", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
		
		
		public static int interpolationSearch(entry[] dictionary, String word) { //TWO PERIMETERS - THE ARRAY OF STRINGS AND THE VALUE OR WORD WE ARE SEARCHING FOR
	        int right = dictionary.length - 1;
	        int left = 0;

	        //CONDITION FOR PROBING OR SEARCHING - SHRINKS THE SEARCHABLE AREA
	        while (left <= right && word.compareTo(dictionary[left].word) >= 0 && word.compareTo(dictionary[right].word) <= 0) {
	        	
	        	//FORMULA FOR CHECKING THE ESTIMATE POSITION OF THE WORD - TAKES THE MIDDLE OF THE ARRAY
	            int pos = left + (((right - left) * (word.compareTo(dictionary[left].word))) /
	                    (dictionary[right].word.compareTo(dictionary[left].word)));

	            // CHECKS IF THE WORD IS IN THE ESTIMATED POSITION WITHIN THE ARRAY
	            if (dictionary[pos].word.equals(word)) {
	                return pos;
	            }

	            	//NARROWS THE SEARCHING IN THE RIGHT IF THE WORD IS LESS THAN INDEX or POS 0
	            if (word.compareTo(dictionary[pos].word) < 0) {
	                right = pos - 1;
	            }
	            
	            else {
	            	//NARROWS THE SEARCHING IN THE LEFT IF THE WORD IS GREATER THAN INDEX or POS 0
	                left = pos + 1;
	            	}
	            
	            //IT WILL ITERATE UNTIL THE POSITION OF THE WORD IN THE ARRAY IS FOUND
	            
	        	}
	        	
	        //IF THE WORD IS NOT FOUND ON EITHER SIDE
	        return -1;
	    }
}
