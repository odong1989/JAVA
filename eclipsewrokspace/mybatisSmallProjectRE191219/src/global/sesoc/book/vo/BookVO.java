package global.sesoc.book.vo;

public class BookVO {
private String bookName;
private String bookFormat;
private int    booksells;
private String bookKinds;

public BookVO() {
	super();
	// TODO Auto-generated constructor stub
}


public BookVO(String bookName, String bookFormat, int sells, String bookKinds) {
	super();
	this.bookName = bookName;
	this.bookFormat = bookFormat;
	this.booksells = sells;
	this.bookKinds = bookKinds;
}


public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookFormat() {
	return bookFormat;
}
public void setBookFormat(String bookFormat) {
	this.bookFormat = bookFormat;
}
public int getSells() {
	return booksells;
}
public void setSells(int booksells) {
	this.booksells = booksells;
}
public String getBookKinds() {
	return bookKinds;
}
public void setBookKinds(String bookKinds) {
	this.bookKinds = bookKinds;
}


@Override
public String toString() {
	return "BookVO [bookName=" + bookName + ", bookFormat=" + bookFormat + ", booksells=" + booksells + ", bookKinds="
			+ bookKinds + "]";
}

}
