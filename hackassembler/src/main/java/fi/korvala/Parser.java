package fi.korvala;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Parser {
    private final File file;
    private final BufferedReader reader;

    public Parser(File file) throws FileNotFoundException {
        this.file = file;
        reader = new BufferedReader(new FileReader(file));
    }

    public boolean hasMoreLines() {
        return false;
    }

    public void advance() {}
    public String instructionType() {
        return "";
    }

    public String symbol() {
        return "";
    }

    public String dest() {
        return "";
    }

    public String comp() {
        return "";
    }

    public String jump() {
        return "";
    }
}
