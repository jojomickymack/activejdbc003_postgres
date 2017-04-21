package central;

import org.javalite.activejdbc.Base;

public class Main {
    public static void main(String[] args) {
        Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/java_database", "jdbc_user", "password123");

        Cat cat = new Cat();
        cat.set("name", "toodles");
        cat.set("color", "brown");
        cat.saveIt();
    }
}



