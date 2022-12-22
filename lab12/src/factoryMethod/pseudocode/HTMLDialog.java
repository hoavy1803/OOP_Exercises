package factoryMethod.pseudocode;

public class HTMLDialog extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}
