package com.jcourse.ochirov.seminar2.Commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class MulCommand implements Command{
    Stack<Double> stack;

    public MulCommand(Stack<Double> stack){
        this.stack = stack;
    }

    public void execute(){
        //*
        try {
            stack.push(stack.pop() * stack.pop());
        }
        catch(EmptyStackException e){
            System.out.println("Стек пустой");
        }
    }
}
