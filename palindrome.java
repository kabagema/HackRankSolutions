import java.io.*;
import java.util.*;

public class Solution {
    public class Node{
    Node next = null;
    char data;
    public Node(char d)
    {
        this.data = d;
    }
}
    Node top;
    Node first;
    Node last = top;
    //top = last;
    // Write your code here.
    public void pushCharacter(char ch)
    {
        Node t = new Node(ch);
        t.next = top;
        top = t;
    }

    public void enqueueCharacter(char ch)
    {
       if(first == null){
           last = new Node(ch);
           first = last;

       } 
       else{
           last.next = new Node(ch);
           last = last.next;
       }
    }

    public char popCharacter()
    {
        if (top != null)
        {
            char item = top.data;
            top = top.next;
            return item;
        }
        else{
            char item = '\0';
            return item;
       }
    }

    public char dequeueCharacter()
    {
        if(first != null)
        {
            char item = first.data;
            first = first.next;
            return item;
        }
        else{
            char item = '\0';
            return item;
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}