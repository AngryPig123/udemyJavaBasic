package DesignPatterns.singleton5;

public class BillPughApproach {

    private int data = 0;

    private BillPughApproach(){}
    private static class SingletonHelper{
        private static final BillPughApproach uniqueBillPughApproach = new BillPughApproach();
    }

    public static BillPughApproach getInstance(){
        return SingletonHelper.uniqueBillPughApproach;
    }



}
