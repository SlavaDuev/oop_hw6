// Интерфейс для работы с данными
public interface ValueHolder {
    String getValueAsString();
}

// Класс для хранения целочисленного значения
public class IntegerValue implements ValueHolder {
    private int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getValueAsString() {
        return String.valueOf(value);
    }
}

// Класс для хранения строкового значения
public class StringValue implements ValueHolder {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getValueAsString() {
        return value;
    }
}

// Класс, использующий интерфейс ValueHolder для работы с данными
public class MyClass {
    private ValueHolder valueHolder;

    public MyClass(ValueHolder valueHolder) {
        this.valueHolder = valueHolder;
    }

    // Геттер и сеттер для valueHolder
    public ValueHolder getValueHolder() {
        return valueHolder;
    }

    public void setValueHolder(ValueHolder valueHolder) {
        this.valueHolder = valueHolder;
    }
}
