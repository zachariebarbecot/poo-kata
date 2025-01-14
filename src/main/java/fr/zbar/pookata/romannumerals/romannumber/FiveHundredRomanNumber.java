package fr.zbar.pookata.romannumerals.romannumber;

public record FiveHundredRomanNumber(HundredRomanNumber number) implements RomanNumber {

    public FiveHundredRomanNumber(int value) {
        this(new HundredRomanNumber(value));
    }

    @Override
    public String stringValue() {
        int value = number.number().number().number().number().value();
        if (value < 400) {
            return number.stringValue();
        }
        if (value < 500) {
            return new HundredRomanNumber().stringValue()
                + "D"
                + new HundredRomanNumber(value - 400).stringValue();
        }
        return "D" + new FiveHundredRomanNumber(value - 500).stringValue();
    }
}
