package com.jcourse.ochirov.seminar2.Parser;

import com.jcourse.ochirov.seminar2.Commands.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Context {
    ArrayList<Command> commands;
    Map<String, Double> variables;
    Stack<Double> stack;

    public Context(ArrayList<Command> commands, Map<String, Double> variables, Stack<Double> stack) {
        this.commands = commands;
        this.variables = variables;
        this.stack = stack;
    }
}
