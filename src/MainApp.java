import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
       repeat("Hello there",5);
    }

    public static void repeat (String sentence, int times){
        for (int i = 0; i <times; i++) {
            System.out.println(sentence);
        }
    }
}
