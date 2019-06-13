package com.jcourse.ochirov.seminar2;

import com.jcourse.ochirov.seminar2.Commands.Command;
import com.jcourse.ochirov.seminar2.Parser.ConsoleParser;
import com.jcourse.ochirov.seminar2.Parser.FileParser;
import com.jcourse.ochirov.seminar2.Parser.Parser;

import java.util.List;

public class Calc{
    Parser parser;

    public Calc(Parser parser) {
        this.parser = parser;
    }

    void execute(){
        List<Command> commands = parser.getCommands();
        for (Command command : commands){
            command.execute();
        }
    }

    public static void main(String[] args) {
        Parser parser;
        if (args.length == 0) {
            parser = new ConsoleParser();
        } else {
            parser = new FileParser(args[0]);
        }
        Calc calc = new Calc(parser);
        calc.execute();
    }
}
