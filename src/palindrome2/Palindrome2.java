/*
 * Ferris D.
 * 13/09/2018
 * Look through a sentence and count palindromes
 */

package palindrome2;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sentence = JOptionPane.showInputDialog("This program will find how many palindromes are in your sentence"+"\nPlease enter a sentence below");
        sentence += " ";
        String reverseSentence = "";
        String word = "";
        String backwardsWord = "";
        String list = "";
        int spacePos = 0;
        int palindromeCount = 0;
        while (sentence.length()>0){
            backwardsWord = "";
            spacePos = sentence.indexOf(" ");
            word = sentence.substring(0, spacePos);
            sentence = sentence.substring(spacePos+1, sentence.length());
            for (int pos = word.length()-1; pos>=0;pos--){
                backwardsWord += word.charAt(pos);
            }
            if (word.equalsIgnoreCase(backwardsWord)){
                palindromeCount++;
                list += backwardsWord+", ";
            }
        }
        System.out.println("The Palindromes are"+"\n"+list);
        JOptionPane.showMessageDialog(null, "There are "+palindromeCount+" palindromes");
        JOptionPane.showMessageDialog(null, "The palindromes are"+"\n"+list);
    }
    
}
