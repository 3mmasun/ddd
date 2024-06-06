package product;

public class App {
    public static void main(String[] args) {
        ProductCode a = new WidgetCode("W9200");
        ProductCode b = new GizmoCode("G001");
        System.out.println(checkProduct(a));
        System.out.println(checkProduct(b));
    }

    private static String checkProduct(ProductCode a) {
        return switch (a) {
            case WidgetCode w -> w.message();
            case GizmoCode g -> g.sayHi();
        };
    }
}