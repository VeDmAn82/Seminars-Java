package Seminare5;

public class Main {
    public static void main(String[] args) {
        personPassportNumber();
    }

    public static void personPassportNumber() {
        Passport people = new Passport();
        people.add("Васильев", 321456);
        people.add("Петрова", 234561);
        people.add("Иванов", 234432);
        people.add("Петрова", 654321);
        people.add("Иванов", 345678);

        System.out.println(people.find("Петрова"));
    }  
}
