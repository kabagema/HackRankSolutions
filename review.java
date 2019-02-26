import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      //int n;
    String [] TestCase = new String[10];
      //get first input from user // number of ttest cases
    String Tcase = scanner.nextLine();
    int T = Integer.parseInt(Tcase);
    //gnore
   // int T = scanner.
    //System.out.println(T);
      //constraints 1
      if (T > 0 && T < 11)
      {
          for (int i = 0; i <= T; i++)
        { 
            //String test = scanner.nextLine();
            //System.out.println(test);
             TestCase[i] = scanner.nextLine();
            
             char[] myCharArray = TestCase[i].toCharArray();
             //Print each sequential character on the same line
             //System.out.println(myCharArray[0]); 
             // Print each sequential character on the same line
                for(int k = 0; k < TestCase[i].length(); k++)
                {
                    //System.out.println("in this loop\n");
                    if (k % 2 == 0)
                        System.out.print(myCharArray[k]); 
                }
                System.out.print(" ");
                for(int k = 0; k < TestCase[i].length(); k++)
                {
                    //System.out.println("in this loop\n");
                    if (k % 2 == 1)
                        System.out.print(myCharArray[k]); 
                }
                System.out.println();//                  // if ()
        }           
          scanner.close();
      }
       
      //if (!(T >= 1 && T <= 10))
      //{
         // String test = scanner.nextLine();
         // System.out.println(test);
        /*
        for (int i = 0; i < T; i++)
        { 
          TestCase[i] = scanner.nextLine();
          
          char[] myCharArray = TestCase[i].toCharArray();
          // Print each sequential character on the same line
            //System.out.print(myCharArray[0]); 
          }*/
        }
      }
      