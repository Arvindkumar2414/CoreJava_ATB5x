package CoreJava_ATB5x;

public class Lab008_StringOperations {

    public static void main(String[] args) {

        String name = "I love my india";
        String name2 = "I love my india";
        System.out.println(name);
        int count = name.length();
        System.out.println("Total length of the string is " +count);
        String uppercase = name.toUpperCase();
        System.out.println(uppercase);
        String lowercase = name.toLowerCase();
        System.out.println(lowercase);
        String name1 = new String("I love you");
        System.out.println(name1);
        System.out.println(name==name1);
        System.out.println(name==name2);

    }
}
