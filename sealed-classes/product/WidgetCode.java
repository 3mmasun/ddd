package product;

public final class WidgetCode extends ProductCode {
    String code;

    public WidgetCode(String code) {
        if (code.startsWith("W") && code.length() == 5) {
            this.code = code;
        } else throw new IllegalArgumentException("Widget code must start with 'W'");
    }

    @Override
    String message() {
        return "Widget";
    }
}
