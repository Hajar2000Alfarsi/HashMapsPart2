import java.util.HashMap;
import java.util.Map;

public class wordLengthMap {
    public static void main(String[] args) {
        String[] exampleOne = {"a", "bb", "a", "bb"};
        String[] exampleTwo = {"this", "and", "that", "and"};
        String[] exampleThree = {"code", "code", "code", "bug"};

        wordLengthMap tk2= new wordLengthMap();

        System.out.println("Example 1 --> " + tk2.WordLen(exampleOne));
        System.out.println("Example 2 --> " + tk2.WordLen(exampleTwo));
        System.out.println("Example 3 --> " + tk2.WordLen(exampleThree));
    }

    public Map<String, Integer> WordLen(String[] inputText) {
        Map<String, Integer> countWord = new HashMap<>();
        for (String cureentWord: inputText){
            countWord.put(cureentWord, cureentWord.length());
        }
        return countWord;
    }
}
