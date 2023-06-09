import java.util.ArrayList;

public class FrameGenerator {

   public static ArrayList<Frame> frameList = new ArrayList<>();

    public void generate(int frames){
        for (int i = 0; i < frames; i++) {
            Frame frame = new Frame(-1, 0);
            frameList.add(frame);
        }

    }
}
