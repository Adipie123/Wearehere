package Alloperator;

public class StudentConstructor {

    String sName;
    int rollNumber;
    int age;
    String resutl;
    int marks;

    public  StudentConstructor(String sName, int rollNumber, int marks) {
        this.sName = sName;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

     void goodstudents(int marks) {
         if (marks > this.marks) {
             System.out.println(this.sName + "he is good student he got good percentage" + marks);

         }else {System.out.println(this.sName + "he is not a good student" +  marks);

         }
        }

public static void main(String [] args){
        StudentConstructor studentConstructor=new StudentConstructor("manu",17,65);
        studentConstructor.goodstudents(45);


    }
}
