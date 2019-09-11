package sample;

public class Question {
    private String content;
    private int happyCounter;
    private int midCounter;
    private int sadCounter;

    public Question(String content) {
        this.content = content;
        happyCounter = 0;
        midCounter = 0;
        sadCounter = 0;
    }

    public void incrementHappy() {
        happyCounter++;
    }

    public void incrementMid() {
        midCounter++;
    }
    public void incrementSad(){
        sadCounter++;
    }

    public int getHappyCounter() {
        return happyCounter;
    }

    public int getMidCounter() {
        return midCounter;
    }

    public int getSadCounter() {
        return sadCounter;
    }
}