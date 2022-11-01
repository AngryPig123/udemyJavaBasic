package DesignPatterns.FactoryPattern.Challenge;

public class ChallengeMonky implements ChallengeAnimal {
    @Override
    public void shout() {
        System.out.println("Monky!!");
    }

    @Override
    public String animalName() {
        return ChallengeAnimalInfo.MONKY.name();
    }
}