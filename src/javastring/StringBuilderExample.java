package javastring;

public class StringBuilderExample {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        //sb.replace(1,3,"Java");
        System.out.println(sb);//prints Hello Java
    }
}
