import java.util.HashMap;
import java.util.Map;

public class FirstLastCharMap {
    public static void main(String[] args) {
        String[] exampleOne = {"code", "bug"};
        String[] exampleTwo = {"man", "moon", "main"};
        String[] exampleThree = {"man", "moon", "good", "night"};

        FirstLastCharMap tk3 =new FirstLastCharMap();

        System.out.println("Example 1 --> " + tk3.pairs(exampleOne));
        System.out.println("Example 2 --> " + tk3.pairs(exampleTwo));
        System.out.println("Example 3 --> " + tk3.pairs(exampleThree));

    }
    public Map<String, String> pairs(String[] inputText) {
        Map<String, String> resultMap = new HashMap<>();
        for (String currentWord: inputText) {
            String firstChar = currentWord.substring(0,1);
            String lastChar = currentWord.substring(currentWord.length() -1, currentWord.length() );
            resultMap.put(firstChar, lastChar);
        }
        return resultMap;
    }
}
