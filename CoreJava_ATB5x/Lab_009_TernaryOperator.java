package CoreJava_ATB5x;

public class Lab_009_TernaryOperator {
    public static void main(String[] args) {

        String k= 10>5 ? "false": "True";
        System.out.println(k);

        int a=400;
        int b=89;
        int c= 82;

        int d= a>b ? ((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(d);
    }
}
