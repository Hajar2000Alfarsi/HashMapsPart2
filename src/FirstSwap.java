import java.util.*;

public class FirstSwap {
    public static void main(String[] args) {
        String[] exampleOne = {"ab", "ac"};
        String[] exampleTwo = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] exampleThree = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        FirstSwap tk9= new FirstSwap();

        System.out.println("Example 1 --> " + Arrays.toString(tk9.firstSwap(exampleOne)));
        System.out.println("Example 2 --> " + Arrays.toString(tk9.firstSwap(exampleTwo)));
        System.out.println("Example 3 --> " + Arrays.toString(tk9.firstSwap(exampleThree)));
    }
    public String[] firstSwap(String[] inputText) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        for (int i = 0; i < inputText.length; i++) {
            String word = inputText[i];
            String firstChar = word.substring(0, 1);

            if (used.contains(firstChar)) {
                continue;
            }

            if (map.containsKey(firstChar)) {

                int previousIndex = map.get(firstChar);
                String temp = inputText[previousIndex];
                inputText[previousIndex] = inputText[i];
                inputText[i] = temp;

                used.add(firstChar);
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return inputText;
    }
}
