package Unit_03;

import java.util.*;
class exception{
    void basicException() {
        int b=0;
        int a=10/b;
        System.out.println(a);
        System.out.println("Done!");
    }
    void handelException() {
        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Done!");
        }
    }
    void multipleCatch() {

        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        }//child class exception came first
        catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " Arithmeetic!!!!");
            System.out.println("Done!");
        }catch(Exception e) {
            System.out.println(e.getMessage() + " exception!!");
        }
    }
    void inputMinsmatchException() {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int number=sc.nextInt();
            System.out.println("You entered:" + number);
        } catch (InputMismatchException e) {
            System.out.println(e + " Resolved");
        }

        System.out.println("Done!!!!!");
    }
    void stackOverFlowError(int i) {
        try {
            while(i>0) {
                i++;
                stackOverFlowError(i);
            }
            //this is error can't resolved because it is not a exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Other code execute!!");

    }

    void indexOutofBoundException() {
        try {
            int[] num= {1,2,3,4};
            System.out.println(num[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done!!");
    }
    void nullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    //lazy binding when method does not have throws Exception and possibly throwing exception
    void useofThrow(int age) throws Exception{
        if(age<18){
            throw new Exception();
        }
        else{
            System.out.println("You are allowed to enter");
        }
    }
    void useofThrow_And_Finally() {
        try{
            useofThrow(17);
        }catch (Exception e){
            //TODO Auto generated catch block
            e.printStackTrace();
        }
        finally{
            System.out.println("The 'try catch' block is finished");
        }
    }

}
public class P14_ExceptionHandling {


    public static void main(String args[]) {
        exception obj=new exception();
//  obj.basicException();
//  obj.handelException();
//  obj.multipleCatch();
//  obj.inputMinsmatchException();
//  obj.stackOverFlowError(2);
        obj.indexOutofBoundException();
        obj.nullPointerException();
        obj.useofThrow(12);
        obj.useofThrow_And_Finally();
    }
}