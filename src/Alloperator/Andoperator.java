package Alloperator;

public class Andoperator
{ public static void main(String[] args) {

        //Statement 1---> True*True= if statement will print

        int age = 19;
        String city = "agra";

        if (age > 18 & city == "agra") {
            System.out.println("He is eligible for voting in agra");}
        else {System.out.println("He is not eligible for voting");}

        //Statement second false*True= else value will show off

        age = 45;
        city = "pune";

        if (age < 18 & city == "pune") {
            System.out.println("He is eligible for voting in pune ");}
        else {
            System.out.println("he is not eligible for voting in pune");}

        //Statement 3---> False* false---> else value will print

        age = 80;
        city = "delhi";
        if (age < 60 & city == "Pune") {
            System.out.println("He is and old man from delhi");}
        else {System.out.println("he is old man from outside delhi");}


        // Statement 4---> False*false*false ---> else value will print

         int rollnumber = 3;
         String div = "second division";
         int percentage = 56;
        if (rollnumber > 4 & div == "Third division" & percentage < 50)
        {System.out.println("He got second division" + percentage + rollnumber);}
        else {System.out.println("he got third dvision");}



int Test=1;
int rum=2;
String name="radhey";

if (Test>=1 && name=="radhey")
{System.out.println("He is above"+Test+name);}
else{
    System.out.println("heis not above2 students");}

if (Test>2 && name=="shyam"){
    System.out.println("heis a good boy");}
else {
    System.out.println("he is not good student");
}}}