package Solid5Principles.DependencyInjection;

import static Solid5Principles.DependencyInjection.InjectorClass.*;

public class Client {
    private ExampleService service;
    Client(ExampleService service) {
        this.service = service;
    }
    public void greet() {
        System.out.println("hello " + service.getName());
    }

}

interface ExampleService {
    String getName();

}

class DIClass implements ExampleService {
    @Override
    public String getName() {
        return "DIClass!!";
    }
}


class NextClass implements ExampleService {
    @Override
    public String getName() {
        return "NextClass!!";
    }
}

class InjectorClass {
    public static Client getDIClass() {
        return new Client(new DIClass());
    }
    public static Client getNextClass() {
        return new Client(new NextClass());
    }
}

class Main {
    public static void main(String[] args) {
        getDIClass().greet();
        getNextClass().greet();
    }
}
