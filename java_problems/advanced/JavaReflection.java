package java_problems.advanced;

import java.util.*;
import java.lang.reflect.*;

/*
 * Problem Statement
 * 
 * JAVA reflection is a very powerful tool to inspect the attributes of a class
 * in runtime. For example, we can retrieve the list of public fields of a class
 * using getDeclaredMethods().
 * 
 * In this problem, you will be given a class Solution in the editor. You have
 * to fill in the incompleted lines so that it prints all the methods of another
 * class called Student in alphabetical order. We will append your code with the
 * Student class before running it.
 * 
 * You have to print all the methods of the student class in alphabetical order.
 * There is no sample input/output for this problem. If you press "Run Code",
 * it will compile it, but it won't show any outputs.
 */
public class JavaReflection {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Class<?> student = Class.forName("Student");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i < methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}