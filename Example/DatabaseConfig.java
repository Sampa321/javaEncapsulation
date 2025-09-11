 package ClassPractice.OOPS.Encapsulation;

class DatabaseConfig {
    static String url;
    static String username;

    static {
        System.out.println("Static block of database config class executed");
        url= "jdbc:mysql://localhost:3306/mydatabase";
        username="admin";
    }

    static void displayConfig() {
        System.out.println("End of static block of DatabaseConfig class.All static variables initialized.");
        System.out.println("Database URL:" +url);
        System.out.println("Database Username:" +username);
    }
}
public class StaticMethod {
    static {
        System.out.println("Inside static block of static method class");
    }

    public static void main(String[] args) {
        //Access static method
        System.out.println("Start of main()");
        DatabaseConfig.displayConfig();
        System.out.println("End of main()");
    }
}
