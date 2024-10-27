import java.util.ArrayList;

public class Main{
public static void main(String[] args){

    ArrayList<String> words = new ArrayList<String>();    
    words.add("an");
    words.add("band");
    words.add("band");
    words.add("abandon");

    ArrayList<String> word2 = new ArrayList<String>();
    word2.add("to");
    word2.add("too");
    word2.add("stool");
    word2.add("tools");

    ArrayList<String> word3 = new ArrayList<String>();
    word3.add("catch");
    word3.add("bobcat");
    word3.add("catchacat");
    word3.add("cat");
    word3.add("at");


WordChecker x = new WordChecker(words);
System.out.println(x.isWordChain());
WordChecker y = new WordChecker(word3);
System.out.println(y.createList("cat"));
}
}