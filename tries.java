import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TrieNode{
    protected boolean isHead;
    protected char letter ;
    protected TrieNode[] nextLetters;
    
    public TrieNode setNextLetters (char ltr){
        int asciiLetter = (int)ltr;
        nextLetters[asciiLetter]= new TrieNode();
    }
    public TrieNode (char ltr, boolean head){
        isHead = head;
        if (!head){
            letter=ltr;
        }
        nextLetters = new TrieNode[26];
    }
    
    
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean headInitialized = false;
        TrieNode headNode;
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if (headInitialized && op.equals("add")){
                
            }
            else if (op.equals("find")){
                
            }
            else if (!headInitialized && op.equals("add")){
                headNode = new TrieNode(contact.charAt[0], true);
            }
        }
    }
}