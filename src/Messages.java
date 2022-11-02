public class Messages {
    private String text;

    public Messages(String text) {
        this.text = text;
    }

    public void getDetails () {
        System.out.println(text);
        System.out.println("********************");
    }
}
