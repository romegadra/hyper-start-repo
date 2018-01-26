public class BasicJava {

    public static String name;
    public String lastName;

    public static void print() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
    }

    public static void main(String...args) {
        BasicJava.name = "John";
        BasicJava.print();

    }

}