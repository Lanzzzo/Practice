package ru_mirea_lab9;

public interface MyComparable<T> {
    int myCompareTo(T other);
}

class Book implements MyComparable<Book> {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public int myCompareTo(Book other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Book(title='" + title + "', year=" + year + "}";
    }

    public static void main(String[] args) {
        Book book1 = new Book("Book A", 2000);
        Book book2 = new Book("Book B", 1995);

        System.out.println(book1.myCompareTo(book2));
    }
}

