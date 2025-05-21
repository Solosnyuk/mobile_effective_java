public class main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Иван Павлович", "сварщик", "ivan@email.com",
                252244343,120000,36);
        Employee petr = new Employee("Петр Витальевич", "бухгалтер", "petr@email.hk",
                244443568,90000,32);
        Employee maks = new Employee("Максим Олегович", "инженер", "olegovich@email.ru",
                445466577,110000, 43);
        Employee alex = new Employee("Алексей Семенович", "наладчик", "alex@mail.ru",
                54353455,140000, 50);
        Employee artem = new Employee("Артем Васильевич", "экономист", "artem@gmail.ru",
                24355632,100000, 45);

        Employee[] employeeArray = new Employee[5];
            employeeArray[0] = ivan;
            employeeArray[1] = petr;
            employeeArray[2] = maks;
            employeeArray[3] = alex;
            employeeArray[4] = artem;

        Employee.getInfoAge(employeeArray, 40);
    }
}
