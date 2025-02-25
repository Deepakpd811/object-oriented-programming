package Level1;

public class Person {

    private String name;
    private int age;

    Person(){
        this.name = "";
        this.age =0;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }
    public String getName() {
        return name;
    }
}


 class InnerPerson {

    public static void main(String[] args) {
        
        Person p1 = new Person("Deepak",23);
        System.out.println(p1.getName());

        Person p2 = new Person("ritick",20);
        System.out.println(p2.getName());

        Person p3 = new Person(p1);
        System.out.println(p3.getName());


    }
}