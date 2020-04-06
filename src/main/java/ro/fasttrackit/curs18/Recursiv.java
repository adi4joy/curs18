package ro.fasttrackit.curs18;

public class Recursiv {
    public int length(String word) {
        if (word == null) throw new IllegalArgumentException("word cannot be null");
        if (word.isEmpty()) {
            return 0;
        } else {
            return 1 + length(word.substring(1));
        }
    }

    public char uppercase(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            return word.charAt(0);
        } else {
            return uppercase(word.substring(1));
        }
    }

    //conditia de iesire

    //clauza de reintrare
}
