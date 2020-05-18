package javaEssential.ex10;

public class Test1 {

    public static void main(String[] args) {

//        Parent parent=null;
//        Child child = new Child();
//        Parent parent1 = new Child();
//        Brother brother = null;
//
//        parent = child;
//        brother = (Brother) parent;

        Parent p = new Parent();
        System.out.println(p instanceof Object);
        System.out.println(p instanceof Child);
        System.out.println(p instanceof Brother);
        System.out.println(p instanceof Parent);

        Child c = new Child();
        System.out.println(c instanceof Parent);
        System.out.println(c instanceof Child);
        System.out.println(c instanceof Object);

    }


}
