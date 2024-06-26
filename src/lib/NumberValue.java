package lib;

public class NumberValue implements Value {
    private final double value;

    public NumberValue(boolean value) {
        this.value = value ? 1 : 0;
    }

    public NumberValue(double value) {
        this.value = value;
    }

    @Override
    public double asDouble() {
        return value;
    }

    @Override
    public String asString() {
        return Double.toString(value);
    }

    @Override
    public String toString() {
        return asString();
    }
}
