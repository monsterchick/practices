// 定義一個Person類
class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void sayHello(){
        System.out.println("Hello, my name is " + name);
    }
}

// 創建一個Student類， 繼承自Person類
class Student extends Person {
    private String major;

    public Student(String name, int age, String major){
        super(name, age)//super?
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
}

public class Main{
    public static void main(String[] args) {
        // 創建Person對象
        Person person = new Person("John",25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.sayHello();

        System.out.println();

        // 創建Student對象
        Student student = new Student("Alice", 20, "Computer Science.");
        System.out.println("Name: " + student.getName());

    }
}