/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;


/**
 *
 * @author cplummer
 */
public class StackProject {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myStack<String> leStack = new myStack<>();
        
        for(int i = 1; i < 4; i++)//Tests the push method through a for loop.
            leStack.push("Test" + i);
        
        for(int i = 0; i < leStack.getSize();)//Tests the pop method through a loop.
           System.out.println(leStack.pop());
        
        System.out.println(leStack.pop());//Tests the error that prints when the stack is empty.
    }
    
    
}
