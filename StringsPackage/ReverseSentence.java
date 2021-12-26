package StringsPackage;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Sentence : ");
        String sentence = sc.nextLine();
        sc.close();
        sentence = sentence.trim();
        String words[] = sentence.split(" ");
        String newSt = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if(words[i].length() == 0) continue;
            newSt = newSt.concat(words[i].trim()+" ");            
        }
        System.out.println(newSt);
    }
}
