package fr.zbar.pookata.romannumerals.romannumber;

public record OneRomanNumber(int value) implements RomanNumber {

    public OneRomanNumber() {
        this(1);
    }

    @Override
    public String stringValue() {
        if (value == 0) {
            return "";
        }
        return "I" + new OneRomanNumber(value - 1).stringValue();
    }
}
