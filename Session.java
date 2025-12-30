/**
 * Project: AIECS Lab 06
 * Class: Intro to SE
 * Description: Represents study sessions of the day.
 * Name: Chivorn
 * Date: 30-12-2025
 */
public class Session {
    private String sessionTitle;
    private int startTime;
    private int endTime;

    public Session(String sessionTitle, int startTime, int endTime) {
        this.sessionTitle = sessionTitle;
        setDuration(startTime, endTime);
    }


    public void setDuration(int startTime, int endTime) throws IllegalArgumentException {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("startTime must be less than endTime.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}