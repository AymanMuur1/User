public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int theSalary;
    private int age;



    public Employee(String fullName, String position, String email, String telephone, int theSalary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.theSalary = theSalary;
        this.age = age;

    }





    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getTheSalary() {
        return theSalary;
    }

    public void setTheSalary(int theSalary) {
        this.theSalary = theSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
               System.out.println("Full name " + fullName + " \nPosition " +  position + " \nemail " + email + " \nTelephone " + telephone + "\nthe salary " + theSalary + " \nAge " + age);

    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov Ivan", "ingineer", "ivan@mail.ru", "+79999712925",
                50000, 56);
        employee.info();


    }}