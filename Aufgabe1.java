       import java.io.FileInputStream;
        import java.io.FileNotFoundException;
       import java.io.PrintWriter;
       import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
       import java.util.*;
       import java.util.stream.Collectors;

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

        public int getAvailable() {
            return available;
        }

        public int getTotals() {
            return totals;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public void setTotals(int totals) {
            this.totals = totals;
        }

        public void setAvailable(int available) {
            this.available = available;
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
            Book b = null;
            b.author = line.get(1);;
            b.totals = Integer.parseInt(line.get(3));
            b.available = Integer.parseInt(line.get(4));
            b.title = line.get(0);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            //convert String to LocalDate
            LocalDate localDate = LocalDate.parse(line.get(2), formatter);
            b.date = localDate;
            books.add(b);
            sortedBooks.add(b);
        }

        sortedBooks = books.stream().sorted(Comparator.comparing(Book::getTitle).reversed()).collect(Collectors.toList());
        PrintWriter printWriter = new PrintWriter("name.txt");
        sortedBooks.forEach(b -> {
            printWriter.write(b.getTitle() + "#"
                    + b.getAuthor() + "#"
                    + b.getDate().toString() + "#"
                    + b.getTotals() + "#"
                    + b.getAvailable());
            printWriter.write("\n");
        });
        List<Book> authorS = new ArrayList<Book>();
        books.forEach(buch -> {
            if (buch.getAuthor().charAt(0)=='S')
                authorS.add(buch);
        });
        authorS.stream().sorted(Comparator.comparing(Book::getTitle)).collect(Collectors.toList());
        PrintWriter printWriterauth = new PrintWriter("autor.txt");
        authorS.forEach(b -> {
            printWriter.write(b.getTitle() + "#"
                    + b.getAuthor() + "#"
                    + b.getDate().toString() + "#"
                    + b.getTotals() + "#"
                    + b.getAvailable());
            printWriter.write("\n");
        });

        printWriterauth.close();
        printWriter.close();
        sc.close();     //closes the scanner

    }
}
