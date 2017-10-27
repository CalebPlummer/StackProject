/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

import java.util.ArrayList;

/**
 *
 * @author cplummer
 */
public class myStack<T> {
    
    private ArrayList<T> list = new ArrayList<>();

    public void push(T input)
    {
        list.add(input);
    }
    
    public T pop()
    {
        
        try
        {
           T tmp = list.get(list.size()-1);
           list.remove(list.size()-1);
           return tmp; 
        }
        catch(Exception e)
        {
            System.out.println("There is nothing left on the stack to pop off.");
        }
        return null;
    }
    
    public int getSize()
    {
        return list.size();
    }
}
