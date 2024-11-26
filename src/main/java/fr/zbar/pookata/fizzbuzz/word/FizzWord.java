package fr.zbar.pookata.fizzbuzz.word;

public record FizzWord(BuzzWord word, int m) implements Word {

    @Override
    public String stringValue() {
        if (word.number() % m == 0) {
            return "Fizz" + word.stringValue();
        }
        return word.stringValue();
    }
}
