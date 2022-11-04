package DesignPatterns.singleton1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyInitializationTest {

    @Test
    void lazyInitialization() {

        LazyInitialization instance1 = LazyInitialization.getInstance();
        instance1.setData(30);
        System.out.println(instance1);


        instance1 = LazyInitialization.getInstance();
        System.out.println(instance1);

    }

}