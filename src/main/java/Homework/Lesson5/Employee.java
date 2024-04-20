package Homework.Lesson5;

public class Employee {

    private String name;
    private String profession;
    private String email;
    private long telephone;
    private long salary;
    private int age;

    public Employee(String name, String profession, String email, long telephone, long salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

        //this(name, profession, email, telephone, salary, age);
    }

    public void printInfo() {
        System.out.println("Name = " + name + " Profession = " + profession + " Email = " + email + " Telephone = " + telephone + " Salary = " + salary + " Age = " + age);
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getEmail() {
        return email;
    }

    public long getTelephone() {
        return telephone;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
