package fr.zbar.pookata.romannumerals.romannumber;

public record HundredRomanNumber(FiftyRomanNumber number) implements RomanNumber {

    public HundredRomanNumber() {
        this(new FiftyRomanNumber(100));
    }

    public HundredRomanNumber(int value) {
        this(new FiftyRomanNumber(value));
    }

    @Override
    public String stringValue() {
        int value = number.number().number().number().value();
        if (value < 90) {
            return number.stringValue();
        }
        if (value < 100) {
            return new TenRomanNumber().stringValue()
                + "C"
                + new FiftyRomanNumber(value - 90).stringValue();
        }
        return "C" + new HundredRomanNumber(value - 100).stringValue();
    }
}
