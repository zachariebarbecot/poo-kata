package fr.zbar.pookata.fizzbuzz.word;

public record NumberWord(FizzWord word) implements Word {
    public String stringValue() {
        if (word.stringValue().isEmpty()) {
            return String.valueOf(word.word().number());
        }
        return word.stringValue();
    }
}