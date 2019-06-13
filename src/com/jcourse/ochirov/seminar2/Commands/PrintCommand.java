package com.jcourse.ochirov.seminar2.Commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class PrintCommand implements Command{
    Stack<Double> stack;

    public PrintCommand(Stack<Double> stack){
        this.stack = stack;
    }

    public void execute(){
        //PRINT
        try {
            System.out.println(stack.peek());
        }catch(EmptyStackException e){
            System.out.println("Стек пустой");
        }
    }
}
