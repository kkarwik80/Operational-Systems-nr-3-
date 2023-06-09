public class Frame {
    int frameNumber = -1;
    int timeOfStay = 0;


    public Frame(int frameNumber, int timeOfStay) {
        this.frameNumber = frameNumber;
        this.timeOfStay = timeOfStay;
    }

    public void increaseTimeOfStay(){
        timeOfStay++;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public void setTimeOfStay(int timeOfStay) {
        this.timeOfStay = timeOfStay;
    }

    public int getTimeOfStay() {
        return timeOfStay;
    }

    public int getFrameNumber() {
        return frameNumber;
    }
}
