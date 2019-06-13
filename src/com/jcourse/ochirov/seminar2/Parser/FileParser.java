package com.jcourse.ochirov.seminar2.Parser;

import com.jcourse.ochirov.seminar2.Commands.*;

import java.io.*;
import java.util.*;

public class FileParser implements Parser{
    String fileName;
    public FileParser(String arg) {
        fileName = arg;
    }

    @Override
    public List<Command> getCommands(){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            ArrayList<Command> commands = new ArrayList<>();
            Map<String, Double> variables = new HashMap<>();
            Stack<Double> stack = new Stack<>();
            Context context = new Context(commands, variables, stack);
            while(scanner.hasNext()) {
                String s = scanner.nextLine(); //DEFINE a 4
                ReadCommand readCommand = new ReadCommand();
                readCommand.doRead(context,s);
            }
            return commands;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
