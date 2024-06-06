package product;

public sealed abstract class ProductCode permits WidgetCode, GizmoCode {
    String sayHi() {
        return this.message();
    }
    abstract String message();
}
