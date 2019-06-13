package com.jcourse.ochirov.seminar2.Commands;

import com.jcourse.ochirov.seminar2.Commands.Command;

import java.util.Map;
import java.util.Stack;

public class PushCommand implements Command {
    private String[] arguments;
    private Map<String, Double> variables;
    private Stack<Double> stack;

    public PushCommand(String[] arguments, Map<String, Double> variables, Stack<Double> stack){
        this.arguments = arguments;
        this.variables = variables;
        this.stack = stack;
    }

    public void execute(){
        //PUSH a
        //PUSH 4
        try {
            double variableValue = Double.parseDouble(arguments[1]);
            stack.push(variableValue);
        }catch(NumberFormatException e){
            String variableName = arguments[1];
            Double variableValue = variables.get(variableName);
            if (variableValue == null){
                System.out.println("Данной переменной нет в Map");
            }
            else{
                stack.push(variableValue);
            }
        }
    }
}