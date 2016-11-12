package java_problems.data_structures;

import java.util.*;

class Student1 {
   private int token;
   private String fname;
   private double cgpa;
   public Student1(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class JavaPriorityQueue {

    static class PQsort implements Comparator<Student1> {
        
        public int compare(Student1 one, Student1 two) {
            double oneCgpa = one.getCgpa();
            double twoCgpa = two.getCgpa();
            String oneFname = one.getFname();
            String twoFname = two.getFname();
            int oneToken = one.getToken();
            int twoToken = two.getToken();
            
            if (oneCgpa < twoCgpa) {
                return 1;
            } else if (oneCgpa > twoCgpa) {
                return -1;
            } else {
                int compareResult = oneFname.compareTo(twoFname);
                
                if (compareResult < 0) {
                    return -1;
                } else if (compareResult > 0) {
                    return 1;
                } else {
                    if (oneToken < twoToken) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
        
      PQsort pqs = new PQsort();
      PriorityQueue<Student1> pq = new PriorityQueue<>(totalEvents, pqs);
        
      while(totalEvents>0){
         String event = in.next();
         
         if (event.equals("ENTER")) {
             String fname = in.next();
             double cgpa = in.nextDouble();
             int id = in.nextInt();
             
             Student1 s = new Student1(id, fname, cgpa);
             pq.offer(s);
         } else {
             pq.poll();
         }
           
         totalEvents--;
      }
        
      if (pq.size() == 0) {
          System.out.println("EMPTY");
      } else {
    	  Student1 s = pq.poll();
    	  while (s != null) {
    		  System.out.println(s.getFname());
    		  s = pq.poll();
    	  }
      }
      in.close();
    }
}