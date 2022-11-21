import java.util.Arrays;
import java.util.Stack;

public abstract class Person{
   private Long id;
   private String fullname;
   private int age;
   private char gender;

   public Person() {
   }

   @Override
   public String toString() {
      return "Person{" +
              "id=" + id +
              ", fullname='" + fullname + '\'' +
              ", age=" + age +
              ", gender=" + gender +

              '}';
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFullname() {
      return fullname;
   }

   public void setFullname(String fullname) {
      this.fullname = fullname;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public Person(Long id, String fullname, int age, char gender) {
      this.id = id;
      this.fullname = fullname;
      this.age = age;
      this.gender = gender;

   }public void sortAge(int[]ages){
      Arrays.sort(ages);
      System.out.println(ages);
   }
}
