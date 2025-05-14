import java.util.ArrayList;
import java.util.Arrays;

public class Collision {

    static int noOfCollision(ArrayList<Integer> speed, int pos) {
        int coollision = 0;
        for (int n = 0; n < pos; n++) {
            if (speed.get(n) > speed.get(pos)) {
                coollision++;
            }
        }
        for (int n = pos + 1; n < speed.size(); n++) {
            if (speed.get(n) < speed.get(pos)) {
                coollision++;
            }
        }
        return coollision;

    }

    public static void main(String args[]) {
        ArrayList<Integer> speed = new ArrayList<>(Arrays.asList(1, 18, 9, 6, 4, 17));
        System.out.println(noOfCollision(speed, 0));
    }
}