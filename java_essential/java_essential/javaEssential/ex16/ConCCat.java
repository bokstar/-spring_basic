package javaEssential.ex16;


public class ConCCat {

    public static void main(String[] args) {
    String sstirng = "                  Java                  ";
    String s= sstirng.concat("수업ㅋㅋ");
        System.out.println(s);

        System.out.println(sstirng.indexOf('j'));

        String afterTrim = sstirng.trim();
        System.out.println(afterTrim);

    }


}
