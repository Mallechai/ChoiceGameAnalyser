package com.jwp.core;

import com.jwp.utils.MyStringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 *
 * I could make the game playable through command line :P or a GUI
 *
 * TODO: make it so that the program can be run from the command line and then navigate to the folder with the scenes then create and designate a new folder with the output of the program.
 * TODO: allow player to set a softcap and a hardcap that they desire. default softcap = highest found in game, hard cap highest possible
 * TODO: (make extra checks for stats that once they reach 100 cannot go back down, this can be used by the system.)
 *
 */

public class Main {

    /**
     * first thread starts making the scene objects
     * second thread starts analysing the scenes as soon as they pop out. (No some games hop between scene so this wont work
     * @param args
     */

    public static void main(String[] args) {

        ConstraintsAndGoals constraintsAndGoals = new ConstraintsAndGoals();

        String startingFileName = "startup.txt";
        String pathFileName = "C:\\Users\\jwpwo\\Desktop\\games\\choice of game scenes\\SabresOfInfinity\\scenes\\startup.txt";
        StringBuilder theText = new StringBuilder();

        Map<String, String> goals = constraintsAndGoals.getGoals();
        Map<String, String> constraints = constraintsAndGoals.getConstraints();

        String line = null;

        MyStringUtils stringUtils = new MyStringUtils();
        List<String> sceneList = new ArrayList<>();

        try {

            FileReader fileReader = new FileReader(pathFileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null && !line.contains("lastname")){
                if (stringUtils.trimInput(line) != 0) {
                    sceneList.add(line.trim());
                }
                theText.append("\n" + line);
            }

        } catch(FileNotFoundException ex){
            System.out.println("Error reading file '" + startingFileName + "'");
            ex.printStackTrace();
        } catch(IOException ex){
            System.out.println("Error reading file '" + startingFileName + "'");
            ex.printStackTrace();
        }

        System.out.println(theText.toString());

        sceneList.forEach(s -> System.out.println("t: " + s));
    }
}
