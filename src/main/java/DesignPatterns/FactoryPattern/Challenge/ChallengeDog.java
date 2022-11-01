package DesignPatterns.FactoryPattern.Challenge;

public class ChallengeDog implements ChallengeAnimal{
    @Override
    public void shout() {
        System.out.println("Dog!!");
    }

    @Override
    public String animalName() {
        return ChallengeAnimalInfo.DOG.name();
    }
}
