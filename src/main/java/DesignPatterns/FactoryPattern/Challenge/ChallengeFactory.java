package DesignPatterns.FactoryPattern.Challenge;

public class ChallengeFactory {

    public static ChallengeAnimal getAnimal(ChallengeAnimalInfo animal) {

        switch (animal) {
            case CAT:
                return new ChallengeCat();
            case DOG:
                return new ChallengeDog();
            case MONKY:
                return new ChallengeMonky();
            default:
                throw new IllegalStateException("Unexpected value: " + animal);
        }
    }

}
