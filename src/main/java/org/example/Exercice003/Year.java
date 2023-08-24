package org.example.Exercice003;

public class Year {
    private long year;
    private boolean isLeap;

    public Year(){
    }

    public boolean IsYearLeap(long year){
        if ((year%400 == 0) | (year%4 ==0 && year%100 !=0) | (year%4000 == 0)){
            isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }
}
