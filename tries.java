import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TrieNode{
    protected boolean isHead = false;
    protected boolean isWordEnd = false;
    protected char letter ;
    protected TrieNode[] nextLetters= new TrieNode[26];
    
    public TrieNode setNextLetters (char ltr){
        int asciiLetter = (int)ltr;
        letter = ltr;
        nextLetters[asciiLetter]= new TrieNode();
        return nextLetters[asciiLetter];
    }
    public TrieNode (){}
    public TrieNode (char ltr, boolean head){
        isHead = head;
        if (!head){
            letter=ltr;
        }
    }
    
    
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean headInitialized = false;
        TrieNode headNode;
        TrieNode curNode;
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if (headInitialized && op.equals("add")){
                
            }
            else if (op.equals("find")){
                
            }
            else if (!headInitialized && op.equals("add")){
                //handle first char in contact
                headNode = new TrieNode(contact.charAt[0], true);
                curNode = headNode;
                
                for (int i=1; i< contact.length() ; i++){
                    curNode = curNode.setNextLetters(contact.charAt[i]);
                }
                
            }
        }
    }
}
