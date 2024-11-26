package fr.zbar.pookata.fizzbuzz.word;

public record BuzzWord(int number, int m) implements Word {
    @Override
    public String stringValue() {
        if (number % m == 0) {
            return "Buzz";
        }
        return "";
    }
}

