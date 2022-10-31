public class Messages {
    private String text;
    private String receiver;

    public Messages(String text, String receiver) {
        this.text = text;
        this.receiver = receiver;
    }

    public void getDetails () {
        System.out.println("To: " + this.receiver);
        System.out.println(this.text);
        System.out.println("********************");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
