package DesignPatterns.FactoryPattern.Challenge;

public class ChallengeCat implements ChallengeAnimal{
    @Override
    public void shout() {
        System.out.println("Cat!!");
    }

    @Override
    public String animalName() {
        return ChallengeAnimalInfo.CAT.name();
    }
}
