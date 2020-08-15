package com.company.command;

import java.util.Arrays;
import java.util.List;

public class CommandPattern {
    public static void main(String[] args) {
        List<Command> commands = Arrays.asList(new CopyCommand(), new PasteCommand());

        commands.forEach(Command::execute);
    }
}
