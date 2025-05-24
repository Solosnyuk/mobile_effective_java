import racers.Cat;
import racers.Human;
import racers.Robot;

public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean Treadmill(Human human){
        human.run(length);
        if (human.toJump(length)) {
            System.out.println(human.getName() + " успешно пробежал " + length + " метров");
            return true;
        } else {
            System.out.println(human.getName() + " не смог пробежать " + length + " метров");
            return false;
        }
    }

    public boolean Wall(Cat cat){
        cat.toRun(length);
        if (cat.toRun(length)) {
            System.out.println(cat.getName() + " успешно пробежал " + length + " метров");
            return true;
        } else {
            System.out.println(cat.getName() + " не смог пробежать " + length + " метров");
            return false;
        }
    }

    public boolean Wall(Robot robot){
        robot.run(length);
        if (robot.toRun(length)) {
            System.out.println(robot.getName() + " успешно пробежал " + length + " метров");
            return true;
        } else {
            System.out.println(robot.getName() + " не смог пробежать " + length + " метров");
            return false;
        }
    }
}
