package DesignPatterns.singleton4;

public class EagerInitializationApproach {

    private static EagerInitializationApproach uniqueEagerInitializationApproach = new EagerInitializationApproach();

    private EagerInitializationApproach(){}

    public static EagerInitializationApproach getInstance(){
        return uniqueEagerInitializationApproach;
    }

}
