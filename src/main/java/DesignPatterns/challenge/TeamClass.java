package DesignPatterns.challenge;

public class TeamClass {

    private String name;

    private TeamClass() {
        this.name = "default";
    }

    private static class HelperTeamClass {
        private static final TeamClass uniqueTeamClass = new TeamClass();
    }

    public static TeamClass getInstance() {
        return HelperTeamClass.uniqueTeamClass;

    }

    public void changeCaptain(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
