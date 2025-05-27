package racers.Obstacle;

import racers.Participant;

public class Wall implements Obstacle{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean attempt(Participant participant) {
        return participant.jump(height);
    }
}