package Homework.Lesson5;

public class HomeWorkAppL5 {

    public static void main(String[] args) {

        Employee[] empArrays = new Employee[5];
        empArrays[0] = new Employee("Mikhail Kafiiatullov", "JavaSenior", "xxxxxxxx@gmail.com", 567568568, 99000000, 27);
        empArrays[1] = new Employee("José Antonio Domínguez Bandera", "Actor", "banderaspapandreas@mail.ru", 894438928, 100000, 63);
        empArrays[2] = new Employee("Chuck Norris", "Actor", "ChuckFu@yandex.ru", 856756755, 2000000, 84);
        empArrays[3] = new Employee("Sylvester Stallone", "Actor", "RamboForeva@gmail.com", 858585858, 1000000, 77);
        empArrays[4] = new Employee("Arnold Alois Schwarzenegger", "Actor", "janenegr@dmx.de", 453222534, 2500000, 76);
        for (Employee empArray : empArrays) {
            if (empArray.getAge() > 40) {
                empArray.printInfo();
            }
        }

    }
}