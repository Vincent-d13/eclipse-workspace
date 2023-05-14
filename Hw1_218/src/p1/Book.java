package p1;

public class Book implements Comparable<Book>{
	
	private String title;
	private String isbn;
	private Author author;
	private double price;
	
	public Book(String title, String isbn, Author author, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Book o) {
		return this.isbn.compareTo(o.isbn);
	//	return Double.compare(this.price, o.price);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", author=" + author + ", price=" + price + "]";
	}
	
	
	

}
