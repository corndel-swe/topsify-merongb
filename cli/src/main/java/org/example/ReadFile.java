package org.example;


import picocli.CommandLine.Command;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Command(name = "readFile", description = "Reads JSON file and generates SQL Queries")
public class ReadFile  implements Runnable{


    @Override
    public void run() {
        Path filePath = Paths.get("reports", "users.json");
        List<UsersModel> users = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            users = objectMapper.readValue(new File(filePath.toString()), new TypeReference<List<UsersModel>>() {});

            StringBuilder allQueries = new StringBuilder();
       for (UsersModel user : users) {
           String queries = String.format("INSERT INTO users" +
                   " VALUES(%d, '%s', '%s', %s, %s, %s, '%s');",
                   user.getId(),
                   escapeSingleQuotes(user.getUsername()),
                   escapeSingleQuotes(user.getFirstName()),
                   escapeSingleQuotes(user.getLastName()),
                   escapeSingleQuotes(user.getEmail()),
                   escapeSingleQuotes(user.getAvatar()),
                   escapeSingleQuotes(user.getPassword()));
           System.out.println(queries);
                   allQueries.append(queries).append("\n");
       }
        String path = "db/seeds/users.sql";
            Files.writeString(Path.of(path), allQueries.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static String escapeSingleQuotes(String value) {
        return value.replace("'", "''");
    }
}
