package r5a08.example.project;

public class Word {

    public Word(String e) {
    }

    public Score guess(String b) {
        return new Score(this);
    }
}
