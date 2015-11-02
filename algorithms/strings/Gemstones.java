package algorithms.strings;

import java.util.*;

/*
 * Problem Statement: 
 * John has discovered various rocks. Each rock is composed of various elements,
 * and each element is represented by a lower-case Latin letter from 'a' to 'z'.
 * An element can be present multiple times in a rock. An element is called a
 * gem-element if it occurs at least once in each of the rocks.
 * 
 * Given the list of N rocks with their compositions, display the number of
 * gem-elements that exist in those rocks.
 * 
 * Input Format: 
 * The first line consists of an integer, N, the number of rocks.
 * Each of the next N lines contains a rock's composition. Each composition
 * consists of lower-case letters of English alphabet.
 * 
 * Constraints:
 * 1 <= N <= 100
 * Each composition consists of only lower-case Latin letters ('a'-'z').
 * 1 <= length of each composition <= 100
 * 
 * Output Format: 
 * Print the number of gem-elements that are common in these rocks. If there are
 * none, print 0.
 * 
 * Sample Input: 
 * 3
 * abcdde
 * baccd
 * eeabg
 * 
 * Sample Output: 
 * 2
 */
public class Gemstones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, Integer> elements = new HashMap<>();
        HashSet<Character> eachRockComposition = new HashSet<>();
        
        int numRocks = sc.nextInt();
        
        for (int i = 0; i < numRocks; i++) {
            String comp = sc.next();
            for (int j = 0; j < comp.length(); j++) {
                eachRockComposition.add(comp.charAt(j));
            }
            for (Character c : eachRockComposition) {
                if (elements.containsKey(c)) {
                    int num = elements.get(c);
                    num++;
                    elements.replace(c, num);
                } else {
                    elements.put(c, 1);
                }
            }
            eachRockComposition.clear();
        }
        sc.close();
        
        int commonElements = 0;
        
        Collection<Integer> numCommon = elements.values();
        
        for (int i : numCommon) {
            if (i >= numRocks) {
                commonElements++;
            }
        }
        System.out.println(commonElements);
    }
}