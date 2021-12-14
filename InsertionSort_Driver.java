 //name: Phuong Pham     date:
import java.util.*;
import java.io.*;
public class InsertionSort_Driver
{
   public static void main(String[] args) throws Exception
   {
     //Part 1, for doubles
      int n = (int)(Math.random()*100)+20;
      double[] array = new double[n];
      for(int k = 0; k < array.length; k++)
         array[k] = Math.random()*100;	
      
      Insertion.sort(array);
      print(array);
      
      if( isAscending(array) )
         System.out.println("In order!");
      else
         System.out.println("Out of order  :-( ");
      System.out.println();
      
      //Part 2, for Strings
      int size = 100;
      Scanner sc = new Scanner(new File("declaration.txt"));
      Comparable[] arrayStr = new String[size];
      for(int k = 0; k < arrayStr.length; k++)
         arrayStr[k] = sc.next();	
   
      Insertion.sort(arrayStr);
      print(arrayStr);
      System.out.println();
      
      if( isAscending(arrayStr) )
         System.out.println("In order!");
      else
         System.out.println("Out of order  :-( ");
   }
   public static void print(double[] a)
   {
      for(double d: a)         //for-each
         System.out.print(d+" ");
      System.out.println();
   }
   public static void print(Object[] papaya)
   {
      for(Object abc : papaya)     //for-each
         System.out.print(abc+" ");
   }
   public static boolean isAscending(double[] a)
   {
      for (int i=0; i<a.length-1; i++) {
         if (a[i]>a[i+1]) return false;
      } return true;
   }
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   public static boolean isAscending(Comparable[] a)
   {
      for (int i=0; i<a.length-1; i++) {
         if (a[i].compareTo(a[i+1])>0) return false;
      } return true;
   }
}

//**********************************************************
 //name: Phuong Pham     date:
class Insertion
{
   public static double[] sort(double[] array)
   { 
      for (int i=1; i<array.length; i++)
         shift(array, i, array[i]);
         
      return array;
   }
   private static int shift(double[] array, int index, double value)
   {      
      int a = index-1;
      while (a>0 && array[a]>value) {
         array[a+1] = array[a];
         a--;
      }
      array[a] = value;
      return a;
   }
   @SuppressWarnings("unchecked")
    public static Comparable[] sort(Comparable[] array)
   { 
      for (int i=1; i<array.length; i++)
         shift(array, i, array[i]);
         
      return array;
   }
   @SuppressWarnings("unchecked")
    private static int shift(Comparable[] array, int index, Comparable value)
   {
      int a = index-1;
      while (a>0 && array[a].compareTo(value)>0) {
         array[a+1] = array[a];
         a--;
      }
      array[a] = value;
      return a;
   }
}
