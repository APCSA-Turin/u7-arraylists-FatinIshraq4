import java.util.ArrayList;
public class Runn {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

        for (String str : words) {
            if (str.substring(0,1).equals("h")) {
                break;
            } else {System.out.println(str);}
        }
    }
}
