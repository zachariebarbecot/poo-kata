package fr.zbar.pookata.romannumerals.romannumber;

public record ThousandRomanNumber(FiveHundredRomanNumber number) implements RomanNumber {

    public ThousandRomanNumber(int value) {
        this(new FiveHundredRomanNumber(value));
    }

    @Override
    public String stringValue() {
        int value = number.number().number().number().number().number().value();
        if (value < 900) {
            return number.stringValue();
        }
        if (value < 1000) {
            return new HundredRomanNumber().stringValue()
                + "M"
                + new FiveHundredRomanNumber(value - 900).stringValue();
        }
        return "M" + new ThousandRomanNumber(value - 1000).stringValue();
    }
}
