import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("FCFS\n--------");
        int counterIsEqual = 0;
        int requestRange = 20;
        int howManyRequests = 510;
        int fails = 0;
        int counter = 0;
        Random random = new Random();
        FrameGenerator frameGenerator = new FrameGenerator();


        frameGenerator.generate(5);
        int framesQuantity = frameGenerator.frameList.size();



        for (int i = 0; i < howManyRequests; i++) {
            Frame longestWaitingFrame = frameGenerator.frameList.get(counter);
            int appeal = random.nextInt(0, requestRange);

            for (int j = 0; j <framesQuantity ; j++) {
                if (frameGenerator.frameList.get(j).getFrameNumber() == appeal){
                counterIsEqual++;
                }
            }

            if (counterIsEqual == 0) {
                longestWaitingFrame.setFrameNumber(appeal);
                if (counter == framesQuantity-1) {
                    counter = 0;
                } else {
                    counter++;
                }
                fails++;
            }
            counterIsEqual = 0;
         }
        System.out.println("Fails: " + fails);
    }
}
