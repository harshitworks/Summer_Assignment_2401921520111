package Week_2.OOPS.live;

import Week_2.OOPS.music.Playable;
import Week_2.OOPS.music.string.Veena;
import Week_2.OOPS.music.wind.Saxophone;

public class Test {
    static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        System.out.println("--------------👀👀👀 ------------");
        Saxophone s = new Saxophone();
        s.play();

        System.out.println("---------USING INTERFACE REFERENCE -🥁🥁🥁------------");
        Playable m = new Veena();
        m.play();
        System.out.println("-------------🎸🎸🎸🎸------------");
        Playable m2 = new Saxophone();
        m2.play();
    }
}
