package Question_03;

class Book {
    private int pages; // number of pages in the book
    Book(int pages) {
        this.pages = pages;
    }
    public String toString() {
        return ""+pages; // convert pages to String before returning
    }
}
