import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // Lấy đối tượng Class của lớp Person
        Class<Person> personClass = Person.class;

        // Lấy tất cả các thuộc tính (fields) của lớp
        Field[] fields = personClass.getDeclaredFields();

        // In ra tên và kiểu dữ liệu của từng thuộc tính
        for (Field field : fields) {
            System.out.println("Tên thuộc tính: " + field.getName());
            System.out.println("Kiểu dữ liệu: " + field.getType().getSimpleName());
            System.out.println();
        }
    }
}

class Person {
    private String name;
    private int age;
    private boolean isEmployed;

    public Person(String name, int age, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }
}
