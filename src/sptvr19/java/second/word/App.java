package sptvr19.java.second.word;

import java.util.Scanner;
     
class App {
    
    public void run() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" -x-x-x- Second Word Finder -x-x-x- ");
        System.out.println("  -x-x-x- By Georg Laabe -x-x-x- ");
      
        System.out.print("\nInput your sentence: ");   
        String sentence = scan.nextLine();
        
        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ", firstSpace + 1);
        
        if (firstSpace < 0) {
            System.out.println("\nThere is no enough words! ");   
        } else if (secondSpace < 0) {
            System.out.println("\nSecond word is: " + sentence.substring(firstSpace+1));   
        } else {
            System.out.println("\nSecond word is: " + sentence.substring(firstSpace+1,secondSpace));   
        }
        
        
    }
    
}
