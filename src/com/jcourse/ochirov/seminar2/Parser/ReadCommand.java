package com.jcourse.ochirov.seminar2.Parser;

import com.jcourse.ochirov.seminar2.Commands.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReadCommand {
    public Command doRead(Context context, String s){
        String[] arguments = s.split(" "); //[DEFINE a 4]
        CommandName commandName = CommandName.valueOf(arguments[0].toUpperCase());
        System.out.println("commandName = " + commandName);
        Command command;
        switch (commandName) {
            case DEFINE:
                command = new DefineCommand(arguments, context.variables);
                break;
            case PUSH:
                command = new PushCommand(arguments, context.variables, context.stack);
                break;
            case PLUS:
                command = new SumCommand(context.stack);
                break;
            case MINUS:
                command = new DiffCommand(context.stack);
                break;
            case MUL:
                command = new MulCommand(context.stack);
                break;
            case DIV:
                command = new DivCommand(context.stack);
                break;
            case SQRT:
                command = new SqrtCommand(context.stack);
                break;
            case PRINT:
                command = new PrintCommand(context.stack);
                break;
            default:
                throw new IllegalStateException("Неизвестная команда");
        }
        context.commands.add(command);
        return null;
    }
}
