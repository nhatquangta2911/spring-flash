package ryan.corepractice1_scope_and_reference;

public class BeanScopeSingleton {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
