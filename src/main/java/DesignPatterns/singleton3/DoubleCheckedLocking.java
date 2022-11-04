package DesignPatterns.singleton3;

import DesignPatterns.singleton2.SynchronizeSingleton;

public class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking doubleCheckedLocking = null;
    private int data = 0;

    private DoubleCheckedLocking() {
    }

    public static DoubleCheckedLocking getInstance() {
        if (doubleCheckedLocking == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (doubleCheckedLocking == null) {
                    doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }

}
