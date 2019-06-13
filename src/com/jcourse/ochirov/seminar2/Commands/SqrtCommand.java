package com.jcourse.ochirov.seminar2.Commands;

import java.util.EmptyStackException;
import java.util.Stack;

import static java.lang.Math.sqrt;

public class SqrtCommand implements Command{
    Stack<Double> stack;

    public SqrtCommand(Stack<Double> stack){
        this.stack = stack;
    }

    public void execute(){
        //sqrt
        try {
            stack.push(sqrt(stack.pop()));
        } catch(EmptyStackException e){
            System.out.println("Стек пустой");
        } catch(ArithmeticException f){
            System.out.println("Отрицательное значение под корнем");
        }
    }
}
