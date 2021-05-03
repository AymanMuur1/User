public class User {
    private String name;
    private String surname;
    private String lastName;

    public User(String name, String surname,String lastName){
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
    }
    public void jump(){
        System.out.println("Человек " + surname +  "прыгнул");
    }


}
