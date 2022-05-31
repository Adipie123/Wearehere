package Arraypackage;
import  java.util.ArrayList;
class ArrayListlt {

    public void arraylist(){
        ArrayList arrayList=new ArrayList();
        arrayList. add("Abhishek");
        arrayList.add(22);
        arrayList.add(12);
        arrayList.add(35.787);
        for (Object var: arrayList){
            System.out.println(var);
        }
       for (int i=0;i<arrayList.size();i++){
           System.out.println(arrayList.get(i));
       }
    }public static void main    (String []args){
        ArrayListlt obj=new ArrayListlt();
        obj.arraylist();


    }
}
