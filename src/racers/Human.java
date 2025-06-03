package racers;

import racers.Obstacle.Obstacle;

public class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private double maxJumpHeight;

    public Human(String name, int maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
            return false;
        }
    }
    @Override
    public boolean jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " прыгнул " + height + " м.");
            return true;
        } else {
            System.out.println(name + " не смог прыгнуть " + height + " м.");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean passObstacles(Obstacle[] obstacles) {
        System.out.println("\n" + "Участник: " +  getName());
        for (Obstacle obstacle : obstacles) {
            if (!obstacle.attempt(this)) {
                System.out.println(name + " выбыл из соревнования.");
                return false;
            }
        }
        return true;
    }
}