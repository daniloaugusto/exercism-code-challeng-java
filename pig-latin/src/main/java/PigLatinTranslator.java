import java.util.ArrayList;
import java.util.Arrays;

public class PigLatinTranslator {
  private ArrayList<String> vowelList = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u"));
  private ArrayList<String> compostTwoVowelList = new ArrayList<String>(Arrays.asList("yt", "xr"));
  private ArrayList<String> compostTwoConsonantList = new ArrayList<String>(Arrays.asList("ch", "qu", "th", "rh"));
  private ArrayList<String> compostThreeConsonantList = new ArrayList<String>(Arrays.asList("squ", "thr", "sch"));

  public String translate(String phrase) {
    String[] words = phrase.split(" "); 
    String translatedPhrase = "";
    String word = "";
    for (int i = 0; i < words.length; i++) {
      word = words[i];

      if (vowelList.contains(word.substring(0, 1)) || compostTwoVowelList.contains(word.substring(0, 2))) {
        translatedPhrase += word + "ay ";
      } else if (word.length() > 3 && compostThreeConsonantList.contains(word.substring(0, 3))) {
        translatedPhrase += word.substring(3, word.length()) + word.substring(0, 3) + "ay ";
      } else if (compostTwoConsonantList.contains(word.substring(0, 2))) {
        translatedPhrase += word.substring(2, word.length()) + word.substring(0, 2) + "ay ";
      } else {
        translatedPhrase += word.substring(1, word.length()) + word.substring(0, 1) + "ay ";
      }
    }
    
    return translatedPhrase.trim();
  }

}
