package javastring;

public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("World");//now original string is changed
        //sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
    }
}
