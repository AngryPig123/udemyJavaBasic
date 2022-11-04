package DesignPatterns.singleton2;

public class SynchronizeSingleton {

    private static SynchronizeSingleton lazyInitialization = null;
    private int data = 0;

    private SynchronizeSingleton() {
    }

    public static synchronized SynchronizeSingleton getInstance() {
        if (lazyInitialization == null) {
            lazyInitialization = new SynchronizeSingleton();
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
