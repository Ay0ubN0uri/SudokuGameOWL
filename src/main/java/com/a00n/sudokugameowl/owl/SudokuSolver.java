package com.a00n.sudokugameowl.owl;

import com.a00n.sudokugameowl.App;
import com.a00n.sudokugameowl.base.Field;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class SudokuSolver {
    private final Field[][] fields;

    private final String ontologyTemplateContent;

    public SudokuSolver(Field[][] fields){
        this.fields = fields;
        ClassLoader classLoader = App.class.getClassLoader();
        String filepath = Objects.requireNonNull(classLoader.getResource("owl9x9.owl")).getFile();
        filepath = URLDecoder.decode(filepath, StandardCharsets.UTF_8);
        this.ontologyTemplateContent = readFileToString(filepath);
    }


    public void test()  {
        new SudokuSolver(new Field[10][10]);
    }

    private String generateSameAsAxioms() {

        StringBuilder sameAsAxioms = new StringBuilder();
        for (Field[] cells : fields) {
            for (Field cell : cells) {
                if (!cell.isEmpty()) {
                    sameAsAxioms.append(cell.generateSameAsAxiom()).append("\n");
                }
            }
        }
        return sameAsAxioms.toString();
    }

    private  String readFileToString(String filepath) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
