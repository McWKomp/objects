package mainPackage;

public class personTask {
    public static void main(String[] args) {

        Person person = new Person();

        person.fullName = "Olexander Usenko";
        person.move();
        person.talk("Jebac putina");

        Person person1 = new Person("Valerij Ilovajskij", 25);

    }


}
class Person{
    String fullName;
    int age;

    public void move(){
        System.out.println("Person "+fullName+" walked 1 meter.");
    }

    public void talk(String sentence){
        System.out.println("Person "+fullName+" says: <<"+sentence+">>.");
    }

    Person(){
        System.out.println("This person's name is Olexander Usenko and age of this person is 16");
    }

    Person(String fullName, int age){
        System.out.println("This person's name is "+fullName+" and age of this person is "+age);
    }
}