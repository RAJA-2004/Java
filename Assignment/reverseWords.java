package Assignment;
public class reverseWords {
    public static void main(String[] args) {
        String inputString = "Java is Cool";
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }
        
        reversedString.deleteCharAt(reversedString.length() - 1);

        System.out.println("Input String: " + inputString);
        System.out.println("Output: " + reversedString.toString());
    }
}
