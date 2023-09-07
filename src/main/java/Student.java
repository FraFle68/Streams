public class Student {
    int id;
    String name;
    int postalCode;
    int age;

    public Student(int id, String name, int postalCode, int age) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postalCode=" + postalCode +
                ", age=" + age +
                '}';
    }
}
