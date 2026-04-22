import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String[] exampleOne = {"a", "b", "a"};
        String[] exampleTwo = {"a", "b", "a", "c", "a", "d", "a"};
        String[] exampleThree = {"a", "", "a"};

        WordAppend tk6 = new WordAppend();

        System.out.println("Example 1 --> " + tk6.wordAppendProcessor(exampleOne));
        System.out.println("Example 2 --> " + tk6.wordAppendProcessor(exampleTwo));
        System.out.println("Example 3 --> " + tk6.wordAppendProcessor(exampleThree));
    }
    public String wordAppendProcessor(String[] inputText) {
        Map<String, Integer> countMap = new HashMap<>();
        String result= "";

        for (String currentWord: inputText){
            int newCount = countMap.getOrDefault(currentWord, 0) +1;
            countMap.put(currentWord, newCount);

            if(newCount % 2 == 0){
                result += currentWord;
            }
        }
        return result;
    }
}
