public class Messages {
    private String text;
    private String receiver;

    public Messages(String text, String reviever) {
        this.text = text;
        this.receiver = reviever;
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
