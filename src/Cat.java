
public class Cat {
     private String name;
     private String color;
     private int age;

     public Cat(String name, String color, int age){
          this.name = name;
          this.color = color;
          this.age = age;

     }
     public Cat() {
          this("Barsik");
     }
     public Cat(String name){
          this(name, "Red", 1);

     }
     public void meow(){
          System.out.println(name + " said 'meow'");
     }

     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          //System.out.println("User sets new value to color = " + color );
          this.color = color;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }
}
