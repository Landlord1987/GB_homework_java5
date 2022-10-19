public class Main {
    public static void main(String[] args) {

        Employee employee[] = new Employee[5];
        employee[0] = new Employee("Иванов Иван", "Менеджер", "ivanov@gmail.com", "+79615361220", 35000, 25);
        employee[1] = new Employee("Дмитриев Андрей", "Инженер", "di@gmail.com", "+7912563768", 50000, 42);
        employee[2] = new Employee("Васильев Александр", "Технолог", "va@gmail.com", "+79603361510", 45000, 46);
        employee[3] = new Employee("Романенко павел", "Программист", "rp@gmail.com", "+79361151336", 85000, 35);
        employee[4] = new Employee("Санников Егор", "Экономист", "se@gmail.com", "+79821331689", 30000, 45);

        for (int i = 0; i < employee.length; i++) {
            employee[i].printEmployee();
        }
    }
}
