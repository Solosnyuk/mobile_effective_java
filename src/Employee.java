public class Employee {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, int phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("Имя: " + this.getName() + "\n" +
                "Должность: " + this.getPosition() + "\n" +
                "email: " + this.getEmail() + "\n" +
                "Телефон: " + this.getPhone() + "\n" +
                "Зарплата: " + this.getSalary() + "\n" +
                "Возраст: " + this.getAge() + "\n" +
                "=====================");
    }

    public static void getInfoAge(Employee[] employee, int ageLowLimit) {
        System.out.println("Работники старше " + ageLowLimit + "\n" +
                "=====================\n");

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > ageLowLimit) {
                employee[i].getInfo();
            }
        }
    }

}
