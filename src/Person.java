public class Person {
    String fullName;
    int age;

   // {
   //     fullName = "Георгий";
   //     age = 38;
   // }
    Person(){
    fullName = "Георгий";
    }
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        }
    void talk() {
    System.out.println(fullName +" "+age+" говорит");
        }
    void move() {
    System.out.println(fullName + " говорит");
    }
 }




