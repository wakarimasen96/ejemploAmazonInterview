import java.util.ArrayList;

public class FirstNonRepeatCharacter {

    ArrayList<String> characters;


    public FirstNonRepeatCharacter(ArrayList<String> characters) {
        this.characters = characters;
    }


    public String firstNonRepeat() {
        String first = "";
        int i;



            for (i = 0; i < characters.size()-1; i++) {
                if (characters.get(i).equals(characters.get(i + 1))) {
                    i++;
                }else{
                    first = characters.get(i);
                    break;
            }
                if (characters.get(i).equals(characters.get(i + 1))) {
                    i++;
                } else {
                    if (characters.get(i + 1).equals(characters.get(i + 2))) {
                        i++;
                    } else {
                        first = characters.get(i + 1);
                        break;
                    }

                }

            }

            return first;


        }

    }



