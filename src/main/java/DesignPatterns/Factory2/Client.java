package DesignPatterns.Factory2;

public class Client {

    public static void main(String[] args) {
        String pigSound = new Pig().sound();
        System.out.println(pigSound);

        String catSound = new Cat().sound();
        System.out.println(catSound);
    }

}
