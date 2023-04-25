public class Ebook extends Book {
    private String format;
    private int pageCount;

    public Ebook(String title, String author, String format, int pageCount) {
        super(title, author);
        this.format = format;
        this.pageCount = pageCount;
    }
}
