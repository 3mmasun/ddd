package product;

public final class GizmoCode extends ProductCode {
    String code;
    public GizmoCode(String code) {
        this.code = code;
    }

    @Override
    String message() {
        return "Gizmo";
    }
}