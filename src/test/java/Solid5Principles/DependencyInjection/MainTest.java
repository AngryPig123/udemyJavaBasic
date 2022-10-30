package Solid5Principles.DependencyInjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Solid5Principles.DependencyInjection.InjectorClass.getDIClass;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("injector ref test")
    void injectorRefTest() {
        Assertions.assertSame(getDIClass().getClass(),getDIClass().getClass());
    }

}