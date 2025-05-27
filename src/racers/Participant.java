package racers;

import racers.Obstacle.Obstacle;

public interface Participant {
    boolean run(int distance);
    boolean jump(double height);
    String getName();
    boolean passObstacles(Obstacle[] obstacles);
}