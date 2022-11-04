package DesignPatterns.singleton1;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization = null;
    private int data = 0;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if (lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }

    public void setData(int myData) {
        data = myData;
    }
    public int getData(){
        return data;
    }

}
