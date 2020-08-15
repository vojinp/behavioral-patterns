package com.company.command;

public class CopyCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Performing copy command.");
    }
}
