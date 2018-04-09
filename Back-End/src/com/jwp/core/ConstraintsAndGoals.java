package com.jwp.core;

import java.util.*;
import java.util.Map;

/**
 * ConstraintsAndGoals: things that the program must adhere to mostly for initial choices
 * Goals: things the porgram must strive to achieve
 */

public class ConstraintsAndGoals {

    //hashmap with both key and object as string, as all input will be String based, but will require subsequent parsing.

    private Map<String, String> constraints;
    private Map<String, String> goals;


    public ConstraintsAndGoals(){
        constraints = new HashMap<>();
        constraints.put("age","18");

        goals = new HashMap<>();
        goals.put("soldiering","50");
        goals.put("charisma","50");
        goals.put("intelligence","50");
    }

    public Map<String, String> getConstraints() {
        return constraints;
    }

    public Map<String, String> getGoals() {
        return goals;
    }
}
