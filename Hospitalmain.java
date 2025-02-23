public class Hospitalmain {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "Female");

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());  
        System.out.println("Sex: " + person1.getSex()); 

        person1.setName("Bob");
        person1.setAge(25);
        person1.setSex("Male");

        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());
        System.out.println("Updated Sex: " + person1.getSex());
    }
}
