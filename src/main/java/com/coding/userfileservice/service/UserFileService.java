package com.coding.userfileservice.service;

import com.coding.userfileservice.model.UserData;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
@NoArgsConstructor
public class UserFileService {
    public void insertUserData (UserData userData) {
        try {
            FileWriter fileWriter = new FileWriter("UserFile.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(userData.getUserID() +":"
                                + userData.getHasPassword() +":"
                                + userData.getUserIdentifier() +":"
                                + userData.getGroupIdentifier() +":"
                                + userData.getGecosField() +":"
                                + userData.getHomeDirectory() +":"
                                + userData.getStartProgram());

            printWriter.close();
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<String> getAllUsers() {
        ArrayList<String> userList = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("UserFile.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String userId = parts[0];
                userList.add(userId);
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        return userList;
    }
}
