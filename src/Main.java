import java.time.Clock;
import java.util.ArrayList;

public class Main {
  public static void main (String [ ] args) {

    ArrayList<String> characters = new ArrayList<>();

    characters.add("a");
    characters.add("a");
    characters.add("c");
    characters.add("a");
    characters.add("d");



    FirstNonRepeatCharacter prueba = new FirstNonRepeatCharacter(characters);

    prueba.firstNonRepeat();
    System.out.println(prueba.firstNonRepeat());



  }
}
