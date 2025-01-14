package fr.zbar.pookata.romannumerals.romannumber;

public record FiftyRomanNumber(TenRomanNumber number) implements RomanNumber {

    public FiftyRomanNumber(int value) {
        this(new TenRomanNumber(value));
    }

    @Override
    public String stringValue() {
        int value = number.number().number().value();
        if (value < 40) {
            return number.stringValue();
        }
        if (value < 50) {
            return new TenRomanNumber().stringValue()
                + "L"
                + new TenRomanNumber(value - 40).stringValue();
        }
        return "L" + new FiftyRomanNumber(value - 50).stringValue();
    }
}
