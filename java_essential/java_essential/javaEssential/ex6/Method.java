package javaEssential.ex6;

public class Method {
    int i,j;
    {
        this.i=0;
        this.j=0;

    }

    public Method() {
    }

    int add(){
      return i+j;
    }

    int add(int i,int j){
      return i+j;
    }

    public static void main(String[] args) {
    Method method = new Method();


    }


    public Method(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
