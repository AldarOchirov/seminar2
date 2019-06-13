package com.jcourse.ochirov.seminar2.Commands;

import java.util.*;

public class DefineCommand implements Command {
    String[] arguments;
    Map<String, Double> variables;

    public DefineCommand(String[] arguments, Map<String, Double> variables){
        this.arguments = arguments;
        this.variables = variables;
    }

    @Override
    public void execute() {
        //arguments - [a, 4]
        //DEFINE a 4
        try {
            double variableValue = Double.parseDouble(arguments[2]);
            String variableName = arguments[1];
            variables.put(variableName, variableValue); //положить элемент в Map
            //variables.get(variableName); // достать элемент из Map
        } catch (NumberFormatException e){
            System.err.println("Аргумент "+ arguments[1] + " не число");
        }

        //stack.push(0.5); //положить элемент
        //stack.pop(); //извлечь элемент
        //stack.peek(); //посмотреть первый элемент на стеке не извлекая его
    }
}


