import animals.Animal;
import animals.Cat;
import animals.Dog;
import racers.Human;
import racers.Obstacle.Obstacle;
import racers.Obstacle.Track;
import racers.Obstacle.Wall;
import racers.Participant;
import racers.Robot;

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

        //Employee.getInfoAge(employeeArray, 40);

        //////////////////////////////////////////////////////////

        Dog bobik = new Dog("Бобик");
        Dog bax = new Dog("Бакс");
        Cat felix = new Cat("Феликc");

        bobik.swim(4);
        bobik.run(123);
        felix.run(120);
        felix.swim(2);

        Dog.getCount();
        Animal.getCount();

        /// //////////////////////////////////////////////////////////////////////////

        Participant[] participants = {
                new Human("Артем", 10000, 2),
                new racers.Cat("Барсик", 200, 1),
                new Robot("Р2-Д2", 1000, 1)
        };

        Obstacle[] obstacles = {
                new Track(400),
                new Wall(1),
                new Track(1001)
        };

        for (Participant participant : participants) {
            participant.passObstacles(obstacles);
        }
    }
}