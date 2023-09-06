package StringsAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {     //37  
public static void main(String[] args) {
        String inputString = "programming";

        // Call the findDuplicateCharacters method to find duplicate characters
        Map<Character, Integer> duplicates = findDuplicateCharacters(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Duplicate Characters: " + duplicates.keySet());
    }

    public static Map<Character, Integer> findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] characters = str.toCharArray();

        // Count the occurrences of each character
        for (char c : characters) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Create a map for duplicate characters
        Map<Character, Integer> duplicateMap = new HashMap<>();

        // Find and add duplicate characters to the duplicateMap
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                duplicateMap.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicateMap;
    }
}
