package Alloperator;

import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl;

public class NotOperator {
    public static void main(String[] args) {

        //Statement 1---> Both statement are true, but we are using and operators so the truth is converting in false

        int Age=21;
        String Name="Manvendra";
        if(!(Age>20) & Name=="Manvendra")
        {System.out.println("His name is " + Name + "and his age is"+ Age);}
        else{System.out.println("His name is not " + Name + " and his age is not  " + Age);}

        //Statement 2---> Both statement are false, but and operators is converting them in true

        Age=31;
        Name="Dheeru";

        if(!(Age<30 & Name=="Manu"))
        {System.out.println("His Name is " + Name + "and his age is " + Age);
        }
    else{
            System.out.println("His name is not " + Name+ "and his age is not" + Age);
        }}}

