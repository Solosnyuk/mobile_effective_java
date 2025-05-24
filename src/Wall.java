import racers.Cat;
import racers.Human;
import racers.Robot;

public class Wall {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public boolean Wall(Human human){
        human.jump(height);
        if (human.toJump(height)) {
            System.out.println(human.getName() + " успешно перепрыгнул " + height + " метров");
            return true;
        } else {
            System.out.println(human.getName() + " не смог перепрыгнуть " + height + " метров");
            return false;
        }
    }

    public boolean Wall(Cat cat){
        cat.jump(height);
        if (cat.toJump(height)) {
            System.out.println(cat.getName() + " успешно перепрыгнул " + height + " метров");
            return true;
        } else {
            System.out.println(cat.getName() + " не смог перепрыгнуть " + height + " метров");
            return false;
        }
    }

    public boolean Wall(Robot robot){
        robot.jump(height);
        if (robot.toJump(height)) {
            System.out.println(robot.getName() + " успешно перепрыгнул " + height + " метров");
            return true;
        } else {
            System.out.println(robot.getName() + " не смог перепрыгнуть " + height + " метров");
            return false;
        }
    }
}
