package com.company;

public class Human {
    private String name;
    private String midName;
    private String lastName;

    public Human(String lastName, String name, String midName) {
        this.name = name;
        this.midName = midName;
        this.lastName = lastName;
    }

    public Human(String lastName, String name) {
        this.name = name;
        this.lastName = lastName;
        this.midName="";
    }

    public String getFullName() {

        if(midName.equals(""))
            return String.format("%s %s",lastName,name);
        else
            return String.format("%s %s %s",lastName,name,midName);
    }

    public String getShortName() {
        if(midName.equals(""))
            return String.format("%s %.1s.",lastName,name);
        else
            return String.format("%s %.1s. %.1s.",lastName,name,midName);
    }
}
