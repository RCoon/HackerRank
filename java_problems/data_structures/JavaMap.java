package java_problems.data_structures;

import java.io.*;
import java.util.*;

/*
 * You are given a phone book that consists of people's names and their phone
 * number. After that you will be given some person's name as query. For each
 * query, print the phone number of that person.
 * 
 * Input Format:
 * 
 * The first line will have an integer n denoting the number of entries in the
 * phone book. Each entry consists of two lines: a name and the corresponding
 * phone number.
 * 
 * After these, there will be some queries. Each query will contain a person's
 * name. Read the queries until end-of-file.
 * 
 * Constraints:
 * A person's name consists of only lower-case English letters and it may be in
 * the format 'first-name last-name' or in the format 'first-name'. Each phone
 * number has exactly 8 digits without any leading zeros.
 * 
 * 1 <= n <= 100000
 * 1 <= Query <= 100000
 * 
 * Output Format:
 * 
 * For each case, print "Not found" if the person has no entry in the phone
 * book. Otherwise, print the person's name and phone number. See sample output
 * for the exact format.
 * 
 * Sample Input:
 * 3
 * uncle sam
 * 99912222
 * tom
 * 11122222
 * harry
 * 12299933
 * uncle sam
 * uncle tom
 * harry
 */
public class JavaMap {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
        
        int numEntries = Integer.parseInt(br.readLine());
        for (int i = 0; i < numEntries; i++) {
            String name = br.readLine();
            String num = br.readLine();
            Integer number = new Integer(num);
            phonebook.put(name, number);
        }
        
        String query = br.readLine();
        while (query != null) {
            if (phonebook.containsKey(query)) {
                System.out.println(query + "=" + phonebook.get(query));
            } else {
                System.out.println("Not found");
            }
            query = br.readLine();
        }
    }
}