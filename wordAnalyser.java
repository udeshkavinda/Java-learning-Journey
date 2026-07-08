import java.util.Scanner;
public class wordAnalyser {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        int totalCharactersWithSpaces = sentence.length();

        String withoutSpaces = sentence.replace(" ","");
        int withOutSpacesCount = withoutSpaces.length();


        //word count
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        // vowels

        String vowelsOnly = sentence.replaceAll("[^aeiouAEIOU]","");
        int vowelCount = vowelsOnly.length();

        //consonants

        String onlyLetters = sentence.replaceAll("[^a-zA-Z]","");

        String consonantsOnly = onlyLetters.replaceAll("[aeiouAEIOU]","");
        int consonantCount = consonantsOnly.length();

        //reverse
        String reversed ="";
        for (int i = sentence.length()-1; i>=0 ; i--){
            reversed = reversed+sentence.charAt(i);
        }
        reversed= reversed.trim();

        // is palindrome

        boolean isPalindrome;

        String reversedWithOutSpaces = reversed.replace(" ","");

        if (withoutSpaces.equalsIgnoreCase(reversedWithOutSpaces)){
            isPalindrome = true;

        }else {
            isPalindrome = false;
        }


        // longest word
        String longestWord = words[0];
        for (int i = 0; i< words.length;i++){
            if (longestWord.length()<words[i].length()){
                longestWord = words[i];
            }

        }

        // print section
        System.out.println("===== WORD ANALYSER =====");
        System.out.println("Total characters (with spaces): "+totalCharactersWithSpaces);
        System.out.println("Total characters (without spaces): "+withOutSpacesCount);

        System.out.println("Number of words: "+wordCount);
        System.out.println("Vowels: "+vowelCount);
        System.out.println("Consonants: "+consonantCount);
        System.out.println("Reversed: "+reversed);

       System.out.println(withoutSpaces);
        System.out.println(reversedWithOutSpaces);

        System.out.println("Is Palindrome? "+isPalindrome);
        System.out.println("Longest word: "+longestWord);
    }
}
