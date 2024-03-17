package fi.korvala;

import java.io.File;

public class HackAssembler {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        String filePath = args[0];

        if(filePath == null) {
            throw new IllegalArgumentException("Target file must be provided.");
        }

        var file = new File(filePath);

        if(file.isDirectory()) {
            throw new IllegalArgumentException("Target file can not be a directory.");
        }

        if(!file.exists()) {
            throw new IllegalArgumentException("Target file does not exist: " + file.getAbsolutePath());
        }

        if(!file.getName().endsWith(".asm")) {
            throw new IllegalArgumentException("Target file is not a .asm -file.");
        }
    }
}
