public class Methods {
    public static void main(String[] args) {
        String message= greet("Gaurav", "Bisht");
        System.out.println(message);
    }
    public static String greet(String firstName, String lastName) {
        return "Hello! "+ firstName +" "+ lastName;
    }

}
