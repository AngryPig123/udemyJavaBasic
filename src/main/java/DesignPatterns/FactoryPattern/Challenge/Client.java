package DesignPatterns.FactoryPattern.Challenge;

import static DesignPatterns.FactoryPattern.Challenge.ChallengeFactory.*;

public class Client {
    public static void main(String[] args) {
        getAnimal(ChallengeAnimalInfo.CAT).shout();
        getAnimal(ChallengeAnimalInfo.DOG).shout();
        getAnimal(ChallengeAnimalInfo.MONKY).shout();
    }
}
