package javastring;

public class SplitExample{  
public static void main(String args[]){  
String s1="my name is kartik";
System.out.println(s1);
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String obj:words){
System.out.println(obj);
}  
}}  
