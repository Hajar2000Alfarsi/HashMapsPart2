import java.util.HashMap;
import java.util.Map;

public class WordMultipleOcuurence {
    public static void main(String[] args) {
        String[] exampleOne = {"a", "b", "a", "c", "b"};
        String[] exampleTwo = {"c", "b", "a"};
        String[] exampleThree = {"c", "c", "c", "c"};

        WordMultipleOcuurence tk7 = new WordMultipleOcuurence();

        System.out.println("Example 1 --> " + tk7.wordMultiple(exampleOne));
        System.out.println("Example 2 --> " + tk7.wordMultiple(exampleTwo));
        System.out.println("Example 3 --> " + tk7.wordMultiple(exampleThree));
    }
    public Map<String, Boolean> wordMultiple(String[] inputWord) {
        Map<String, Boolean> resultMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String currentWord: inputWord){
            countMap.put(currentWord,countMap.getOrDefault(currentWord,0) +1);
        }
        for (String word: countMap.keySet()){
            resultMap.put(word,countMap.get(word) >= 2);
        }
        return resultMap;
    }
}
