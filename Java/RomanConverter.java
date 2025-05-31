import java.util.*;

public class RomanConverter {
    private static final Map<Character, Integer> romanMap = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
    );

    public int romanToInt(String s){
        int total = 0;
        int prev = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            int current = romanMap.get(s.charAt(i));
            if(current < prev)
                total -= current;
            else{
                total += current;
                prev = current;
            }
        }
        return total;
    }

}
