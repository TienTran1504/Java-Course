import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
      private String name;
      private LocalDate birthDay;

      private ArrayList<Book> books =new ArrayList<>();

      public void borrow(Book book){
          this.books.add(book);
      }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public User(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge(){
        int age = Period.between(this.birthDay,LocalDate.now()).getYears();
        return age;
    }

}
