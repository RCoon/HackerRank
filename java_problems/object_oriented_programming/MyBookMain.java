package java_problems.object_oriented_programming;

import java.util.*;

/*
 * Problem Statement:
 * In the editor we have provided the abstract Book class and a Main class. In
 * the Main class we created instance of a class called MyBook. Your task is to
 * write just the Mybook class. Your class mustn't be public.
 * 
 * Sample Input:
 * A tale of two cities
 * 
 * Sample Output:
 * The title is: A tale of two cities
 */
abstract class Book
{
   String title;
   abstract void setTitle(String s);
   String getTitle()
   {
      return title;
   }
   
}

class MyBook extends Book {
    
    public void setTitle(String s) {
        super.title = s;
    }
}

public class MyBookMain
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      MyBook new_novel=new MyBook();
      new_novel.setTitle(title);
      System.out.println("The title is: "+new_novel.getTitle());
      sc.close();
   }
}