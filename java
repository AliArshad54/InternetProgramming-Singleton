public class Person {
    private static Person instance;
    private int autoId;
    private String username;
    private String password;
    private String gender;

    // Private constructor to prevent direct instantiation from outside the class
    private Person() {
        // Initialization code here (if needed)
    }

    // Public static method to provide access to the single instance using lazy instantiation
    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "autoId=" + autoId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        System.out.println("p1: " + p1);

        Person p2 = Person.getInstance();
        System.out.println("p2: " + p2);

        // Check if p1 and p2 have the same hash code
        if (p1.hashCode() == p2.hashCode()) {
            System.out.println("p1 and p2 have the same hash code.");
        } else {
            System.out.println("p1 and p2 have different hash codes.");
        }
    }
}
