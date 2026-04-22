import java.util.HashMap;
import java.util.Map;

public class UniqueWordZeroMap {
    public static void main(String[] args) {
        String[] exampleOne = {"a", "b", "a", "b"};
        String[] exampleTwo = {"a", "b", "a", "c", "b"};
        String[] exampleThree = {"c", "b", "a"};

        UniqueWordZeroMap tk1 = new UniqueWordZeroMap();

        System.out.println("Example 1 --> " + tk1.word0(exampleOne));
        System.out.println("Example 2 --> " + tk1.word0(exampleTwo));
        System.out.println("Example 3 --> " + tk1.word0(exampleThree));
    }
    public Map<String, Integer> word0(String[] inputText) {
        Map<String, Integer> wordCountWord = new HashMap<>();
        for (String currentWord: inputText) {
            wordCountWord.put(currentWord, 0);
        }
        return wordCountWord;
    }
}
