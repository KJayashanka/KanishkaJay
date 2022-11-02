class Letter implements Printable {
    private String text;

    Letter(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("text: " + text);
    }
}