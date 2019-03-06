package frst;

public class JSecond {
    int v;
    public JSecond() {
        v = 1;
    }
    public static void main(String[] args) {
        Person2 p2 = new Person2("pasha", false);
        System.out.println(p2.getName());
        System.out.println(p2.isMarried());
    }

}
