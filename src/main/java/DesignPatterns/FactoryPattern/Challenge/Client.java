package DesignPatterns.FactoryPattern.Challenge;

import static DesignPatterns.FactoryPattern.Challenge.ChallengeFactory.*;

public class Client {
    public static void main(String[] args) {

        ChallengeAnimal cat = getAnimal(ChallengeAnimalInfo.CAT);
        ChallengeAnimal dog = getAnimal(ChallengeAnimalInfo.DOG);
        ChallengeAnimal monky = getAnimal(ChallengeAnimalInfo.MONKY);

        System.err.println(cat.animalName());
        System.err.println(dog.animalName());
        System.err.println(monky.animalName());

    }
}
