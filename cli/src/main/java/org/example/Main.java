package org.example;

import picocli.CommandLine.Command;
import picocli.CommandLine;

import java.util.Arrays;

@Command(name = "main", subcommands = ReadFile.class)
public class Main {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new Main());
        System.out.println(Arrays.toString(args));
        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}