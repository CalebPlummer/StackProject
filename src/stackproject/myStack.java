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
    
    public myStack() {
    }
    public void push(T input)
    {
        list.add(input);
    }
    
    public T pop()
    {
        T tmp = list.get(list.size()-1);
        list.remove(list.size()-1);
        return tmp;
        
    }
}