package racers.Obstacle;

import racers.Participant;

public class Track implements Obstacle{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean attempt(Participant participant) {
        return participant.run(length);
    }
}