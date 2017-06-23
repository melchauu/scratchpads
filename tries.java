import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TrieNode{
    protected boolean isHead = false;
    protected boolean isWordEnd = false;
    protected int numChildren = 0;
    protected char letter ;
    protected TrieNode[] nextLetters= new TrieNode[26];
    
    public TrieNode setNextLetters (char ltr){
        int asciiLetter = (int)ltr - 97;
        letter = ltr;
        nextLetters[asciiLetter]= new TrieNode();
        return nextLetters[asciiLetter];
    }
    public TrieNode setLastChar (char ltr){
        isWordEnd = true;
        return this.setNextLetters(ltr);
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
    protected TrieNode headNode = null;
    protected void setHead (TrieNode node){
        headNode = node;
    }
    public static int findContact(String prefix){
        TrieNode curNode = headNode;
        boolean matched = true;
        for (int i=0; i < prefix.length() && matched; i++){
           char ltr = prefix.charAt[i];
           int asciiLetter = (int)ltr - 97;
           if(curNode.nextLetters[asciiLetter] == null){
               matched = false;
           }
           else{
               curNode = curNode.nextLetters[asciiLetter];
           }
        }
        if (matched == false ){
            return 0;
        }
        return curNode.getNumChildren();
    }
    public static void addContact(String contact){
        TrieNode curNode;
        if (!(headNode==null)){
            curNode=headNode;
        }
        else{
            this.setHead(new TrieNode(contact.charAt[0], true));
        }
        for (int i=1; i< (contact.length() -1) ; i++){
            curNode = curNode.setNextLetters(contact.charAt[i]);
        }
        // handle last char in contact
        curNode.setLastChar.(contact.charAt[i]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        TrieNode curNode;
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contactStr = in.next();
            
            if (op.equals("add")){
                this.addContact(contactStr);
            }
            else if (op.equals("find")){
                this.findContact(contactStr);   
            }
        }
    }
}
