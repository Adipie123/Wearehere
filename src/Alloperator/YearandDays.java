package Alloperator;

public class YearandDays {

    public static void main(String [] name){
        printYearsandDays(800000);

    }


    public static void printYearsandDays( long Minutes){

        long Minutestohour = Minutes/60;
        long hourtodays = Minutestohour/24;
        long daystoyear = (hourtodays/365);
        long remainingdays = (hourtodays- 365);

        System.out.println(" total minutes   " + Minutes + " = " + daystoyear + "y" +  " and " + remainingdays + "d" );
    }}


