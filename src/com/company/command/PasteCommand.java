package com.company.command;

public class PasteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Performing paste command.");
    }
}
