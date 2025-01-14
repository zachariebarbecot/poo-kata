package fr.zbar.pookata.romannumerals.romannumber;

public record FiveRomanNumber(OneRomanNumber number) implements RomanNumber {

    public FiveRomanNumber(int value) {
        this(new OneRomanNumber(value));
    }

    @Override
    public String stringValue() {
        int value = number.value();
        if (value < 4) {
            return number.stringValue();
        }
        if (value == 4) {
            return new OneRomanNumber().stringValue() + "V";
        }
        return "V" + new OneRomanNumber(value - 5).stringValue();
    }
}
