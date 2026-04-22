import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {
    public static void main(String[] args) {
        String[] exampleOne = {"a", "b", "a", "c", "b"};
        String[] exampleTwo = {"c", "b", "a"};
        String[] exampleThree = {"c", "c", "c", "c"};

        WordFrequencyCount tk4 = new WordFrequencyCount();

        System.out.println("Example 1 → " + tk4.wordCount(exampleOne));
        System.out.println("Example 2 → " + tk4.wordCount(exampleTwo));
        System.out.println("Example 3 → " + tk4.wordCount(exampleThree));
    }
    public Map<String, Integer> wordCount(String[] inputText) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String currentWord: inputText) {
            if (resultMap.containsKey(currentWord)) {
                resultMap.put(currentWord, resultMap.get(currentWord) + 1);
            } else {
                resultMap.put(currentWord, 1);
            }
        }
        return resultMap;
    }
}
