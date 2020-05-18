package javaEssential.ex17;

public class Stris {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Strinh");
        stringBuffer.append("Shginhs");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        stringBuffer.insert(0, "StringBuffer");
        System.out.println(stringBuffer);
    }

}
