public class Employee {

    String FIO, post, email, telNumber;
    int cost, age;


    Employee(String FIO) {
        this(FIO, "Менеджер");

    }

    Employee(String FIO, String post) {
        this(FIO, post, "ivanov@gmail.com");

    }

    Employee(String FIO, String post, String email) {
        this(FIO, post, email, "+79________");

    }

    Employee(String FIO, String post, String email, String telNumber) {
        this(FIO, post, email, telNumber, 50000);

    }

    Employee(String FIO, String post, String email, String telNumber, int cost) {
        this(FIO, post, email, telNumber, cost, 25);
    }

    Employee(String FIO, String post, String email, String telNumber, int cost, int age) {
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.telNumber = telNumber;
        this.cost = cost;
        this.age = age;
    }

    public void printEmployee() {
        if (age > 40) {
        System.out.printf("ФИО: %s\tДолжность: %s\te-mail: %s\t Номер телефона: %s\tЗарплата: %d\tВозраст: %d\n",
                FIO, post, email, telNumber, cost, age);
        }
    }
}
