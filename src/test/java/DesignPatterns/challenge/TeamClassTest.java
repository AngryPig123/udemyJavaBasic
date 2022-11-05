package DesignPatterns.challenge;

import org.junit.jupiter.api.Test;

class TeamClassTest {

    @Test
    void setup() {
        TeamClass teamClass = TeamClass.getInstance();
        System.out.println(teamClass.hashCode());
        System.out.println(teamClass.getName());

        teamClass.changeCaptain("shguddnr");
        System.out.println(teamClass.hashCode());
        System.out.println(teamClass.getName());

    }

}