package com.jcourse.ochirov.seminar2.Commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class DivCommand implements Command{
    Stack<Double> stack;

    public DivCommand(Stack<Double> stack){
        this.stack = stack;
    }

    public void execute(){
        // /
        try {
            stack.push(stack.pop() / stack.pop());
        }catch(EmptyStackException e){
            System.out.println("Стек пустой");
        }catch(ArithmeticException f){
            System.out.println("Деление на ноль");
        }
    }
}
