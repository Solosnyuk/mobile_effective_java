package racers;

public class Robot {
    private String name;
    private int maxRunLength;
    private double maxJumpHeight;

    public Robot(String name, double maxJumpHeight, int maxRunLength) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void jump(double height) {
        System.out.println(this.name + (toJump(height) ? " успешно перепрыгнул " : " не смог перепрыгнуть ") + height + " м");
    }

    public void run(int length) {
        System.out.println(this.name + (toRun(length) ? " успешно пробежал " : " не смог пробежать ") + length + " м");
    }

    public boolean toRun(int length){
        return maxRunLength >= length;
    }

    public boolean toJump(double heigth){
        return maxJumpHeight >= heigth;
    }
}
