package com.jcourse.ochirov.seminar2.Parser;

import com.jcourse.ochirov.seminar2.Commands.*;

import java.util.*;

public class ConsoleParser implements Parser{
    @Override
    public List<Command> getCommands(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Command> commands = new ArrayList<>();
        Map<String, Double> variables = new HashMap<>();
        Stack<Double> stack = new Stack<>();
        Context context = new Context(commands, variables, stack);
        while(true) {
            String s = scanner.nextLine(); //DEFINE a 4
            ReadCommand readCommand = new ReadCommand();
            readCommand.doRead(context,s);
            if ("exit".equals(s)){
                break;
            }
        }
        return commands;
    }
}