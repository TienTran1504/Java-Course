import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2002-04-15");
        User youngerUser = new User("Tran Dung Tien", date);



        Book book = new Book("Ao Tuong", "Ngoc Bap");
        AudioBook newBook = new AudioBook("Dracula","Bram Stoker", 30000);
        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G Wodehouse", "PDF", 200);
        System.out.println(jeeves.toString());

        youngerUser.borrow(book);
        youngerUser.borrow(newBook);

        System.out.printf("%s was born back in %s and he is now %d years old\n",
                youngerUser.getName(),youngerUser.getBirthDay(), youngerUser.getAge());

        System.out.printf("%s has borrowed these books: %s\n", youngerUser.getName(),youngerUser.getBooks().toString());



    }
}