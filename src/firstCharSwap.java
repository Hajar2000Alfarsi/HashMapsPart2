import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class firstCharSwap {
    public static void main(String[] args) {
        String[] exampleOne = {"ab", "ac"};
        String[] exampleTwo = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] exampleThree = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        firstCharSwap tk8= new firstCharSwap();

        System.out.println("Example 1 --> " + Arrays.toString(tk8.allSwap(exampleOne)));
        System.out.println("Example 2 --> " + Arrays.toString(tk8.allSwap(exampleTwo)));
        System.out.println("Example 3 --> " + Arrays.toString(tk8.allSwap(exampleThree)));
    }

    public String[] allSwap(String[] inputText) {
        Map<String,Integer> positionMap= new HashMap<>();
        for (int i = 0; i < inputText.length; i++) {
            String  currentWord = inputText[i];
            String firstChar = currentWord.substring(0,1);

            if (positionMap.containsKey(firstChar)) {
                int previousIndex = positionMap.get(firstChar);

                String temp = inputText[previousIndex];
                inputText[previousIndex] = currentWord;
                inputText[i] = temp;

                positionMap.remove(firstChar);
            } else {
                positionMap.put(firstChar, i);
            }
        }
        return inputText;
    }
}
