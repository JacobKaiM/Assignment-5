
class Book {
	private String title;
	private String author;
	private int genre;
	private boolean checkedOut;

	public Book(String title, String author, int genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.checkedOut = false;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getGenre() {
		return genre;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public boolean contains(int choice) {
		if (choice == genre) {
			return true;
		} else {
			return false;
		}
	}
}
