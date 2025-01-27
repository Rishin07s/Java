package Java.Encapsulation;

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encap {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setAge(30);

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}

