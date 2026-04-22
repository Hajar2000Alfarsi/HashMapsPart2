import java.util.HashMap;
import java.util.Map;

public class GroupByFirstChar {
    public static void main(String[] args) {
        String[] exampleOne = {"salt", "tea", "soda", "toast"};
        String[] exampleTwo = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] exampleThree = {};

        GroupByFirstChar tk5= new GroupByFirstChar();

        System.out.println("Example 1 --> " + tk5.firstChar(exampleOne));
        System.out.println("Example 2 --> " + tk5.firstChar(exampleTwo));
        System.out.println("Example 3 --> " + tk5.firstChar(exampleThree));
    }
    public Map<String, String> firstChar(String[] inputText){
        Map<String, String> resultMap= new HashMap<>();

        for (String currentWord: inputText) {
            String firstChar = currentWord.substring(0,1);
            if(resultMap.containsKey(firstChar)){
                resultMap.put(firstChar,resultMap.get(firstChar) + currentWord);
            } else {
                resultMap.put(firstChar,currentWord);
            }
        }
        return resultMap;
    }
}

