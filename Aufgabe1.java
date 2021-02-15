import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aufgabe1 {

    private static class Book{
        private String title;
        private String author;
        private int totals;
        private int available;
        private LocalDate date;




        public Book(String title, String author, int totals, int available, String date) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            this.title =title; this.author = author; this.totals = totals; this.available = available;
            LocalDate.parse(date, format);;

        }
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
    }
    }

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("bibliothek.txt");
        Scanner sc=new Scanner(fis);
        List<Book> books = new ArrayList<Book>();
        List<Book> sortedBooks = new ArrayList<Book>();
        while(sc.hasNextLine())
        {
            List<String> line = Arrays.asList(sc.nextLine().split("&"));
            Book b = new Book();
            b.author = line.get(1);;
            b.totals = Integer.parseInt(line.get(3));
            b.available = Integer.parseInt(line.get(4));
            b.title = line.get(0);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            //convert String to LocalDate
            LocalDate localDate = LocalDate.parse(line.get(2), formatter);
            b.date = localDate;
            books.add(b);
        }
        sortedBooks = books.sort();
        sc.close();     //closes the scanner

    }
}

