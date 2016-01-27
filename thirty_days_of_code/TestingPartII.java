package thirty_days_of_code;

/*
 * This challenge is very different from the traditional ones because it
 * requires you to generate valid test cases for a problem instead of solving
 * the problem. There are no sample testcases, you simply have to generate test
 * values for the problem that satisfy both the problem's Input Format and the
 * criterion laid out in the Task section.
 * 
 * Consider the following problem:
 * 
 * Problem Statement: 
 * A Discrete Mathematics professor has a class of N students. Frustrated with
 * their lack of discipline, the professor decides to cancel class if fewer than
 * K students are present when class starts. Given the arrival time of each
 * student, determine if the class is canceled.
 * 
 * Input Format: 
 * The first line of input contains T, the number of test cases.
 * 
 * Each test case spans two lines. The first has two space-separated integers, N
 * (students in the class) and K (the cancellation threshold). The second
 * contains N space-separated integers (a1,...,aN) describing the students'
 * arrival times.
 * 
 * Note: Non-positive arrival times (ai <= 0) indicate the student arrived early or
 * on time; positive arrival times (ai > 0) indicate the student arrived ai
 * minutes late. If a student arrives exactly on time (ai=0), the student is
 * considered to have entered before the class started.
 * 
 * Output Format: 
 * For each test case, print the word YES if the class is canceled or NO if it
 * is not, on a new line.
 * 
 * Example: 
 * When properly solved, this input:
 * 2
 * 4 3
 * -1 -3 4 2
 * 4 2
 * 0 -1 2 1
 * 
 * Should produce this output:
 * YES
 * NO
 * 
 * For the first test case, K=3. The professor wants at least 3 students in
 * attendance, but only 2 arrive on time (-3 and -1). Thus, the class is
 * canceled.
 * 
 * For the second test case, K=2. The professor wants at least 2 students in
 * attendance, and 2 do arrive on time (0 and -1). Thus, the class is not
 * canceled.
 * 
 * Your Task: 
 * You must create and print multiple test cases for the problem above that meet
 * the following criterion:
 * T <= 5
 * 1 <= N <= 200
 * 1 <= K <= N
 * -1000 <= ai <= 1000,where i is an element of [1,N]
 * The value of N should be distinct across all the test cases.
 * Array a must have at least one zero, one positive integer, and one negative
 * integer.
 * 
 * The output for your test case (if it was run against a correct solution to
 * the problem above) should be:
 * YES
 * NO
 * YES
 * NO
 * YES
 * 
 * Print your test cases as output the same way the solution would expect to
 * read them as input. For example:
 * print('1')
 * print('4 3')
 * print('-1 -3 4 2')
 * print('5 2')
 * print('0 -1 2 1 4')
 * 
 * Scoring:
 * If you submit X correct test cases, your score will be 20.0 x X. If you submit
 * more than 5 test cases, only the first 5 test cases will be evaluated.
 */
public class TestingPartII {

    public static void main(String[] args) {
        
        System.out.println("5");
        System.out.println("4 3");
        System.out.println("-1 0 4 2");
        System.out.println("5 2");
        System.out.println("0 -1 2 1 -3");
        System.out.println("3 3");
        System.out.println("-1 0 1");
        System.out.println("6 3");
        System.out.println("-3 0 1 -2 -4 5");
        System.out.println("7 5");
        System.out.println("-2 3 0 -1 2 7 -4");
    }
}