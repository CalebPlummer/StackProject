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
        leStack.push("Test1");
        leStack.push("Test2");
        leStack.push("Test3");
        System.out.println(leStack.pop());
        System.out.println(leStack.pop());
        System.out.println(leStack.pop());
        System.out.println(leStack.pop());
    }
    
    
}
