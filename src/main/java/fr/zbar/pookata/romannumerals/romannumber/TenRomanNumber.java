package fr.zbar.pookata.romannumerals.romannumber;

public record TenRomanNumber(FiveRomanNumber number) implements RomanNumber {

    public TenRomanNumber() {
        this(new FiveRomanNumber(10));
    }

    public TenRomanNumber(int value) {
        this(new FiveRomanNumber(value));
    }

    @Override
    public String stringValue() {
        int value = number.number().value();
        if (value < 9) {
            return number.stringValue();
        }
        if (value == 9) {
            return new OneRomanNumber(1).stringValue() + "X";
        }
        return "X" + new TenRomanNumber(value - 10).stringValue();
    }
}
