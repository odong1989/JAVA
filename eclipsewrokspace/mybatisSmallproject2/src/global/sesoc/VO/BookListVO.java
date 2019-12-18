package global.sesoc.VO;

public class BookListVO {
	int	   bookCode;
	String bookName;
	String bookKinds;
	String bookFormat;	
	String bookMarkets;	
	int    sells;
	
	
	//2.持失切 識情	
	public BookListVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookListVO(int bookCode, String bookName, String bookKinds, String bookFormat, String bookMarkets,
			int sells) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookKinds = bookKinds;
		this.bookFormat = bookFormat;
		this.bookMarkets = bookMarkets;
		this.sells = sells;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookKinds() {
		return bookKinds;
	}

	public void setBookKinds(String bookKinds) {
		this.bookKinds = bookKinds;
	}

	public String getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}

	public String getBookMarkets() {
		return bookMarkets;
	}

	public void setBookMarkets(String bookMarkets) {
		this.bookMarkets = bookMarkets;
	}

	public int getSells() {
		return sells;
	}

	public void setSells(int sells) {
		this.sells = sells;
	}

	//3.get,set methods 
	
	@Override
	public String toString() {
		return "BookListVO [bookCode=" + bookCode + ", bookName=" + bookName + ", bookKinds=" + bookKinds
				+ ", bookFormat=" + bookFormat + ", bookMarkets=" + bookMarkets + ", sells=" + sells + "]";
	}


	


	
}
