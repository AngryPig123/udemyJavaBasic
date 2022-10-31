package DesignPatterns.FactoryPattern.Challenge;

public class ChallengeFactory {


    public static ChallengeAnimal getAnimal(ChallengeAnimalInfo animal) {

        if (animal == ChallengeAnimalInfo.DOG) {
            return new ChallengeDog();
        }

        if (animal == ChallengeAnimalInfo.CAT) {
            return new ChallengeCat();
        }

        if (animal == ChallengeAnimalInfo.MONKY) {
            return new ChallengeMonky();
        }

        throw new RuntimeException("해당하는 동물이 없습니다!");
    }

}
