package Brief_ExcercicesDeBasePOO;

public class Livre {

	private String Title;
	private String AuthorName;
	private String AuthorFirstName;
	private String Category;
	private String ISBN;
	private String Code;
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public String getAuthorFirstName() {
		return AuthorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		AuthorFirstName = authorFirstName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getCode() {
		return Code;
	}

	public Livre(String titre, String name, String firstname, String category, String isbn) {
		this.Title = titre;
		this.AuthorFirstName = firstname;
		this.AuthorName = name;
		this.Category = category;
		this.ISBN = isbn;
		char[] fnm = this.AuthorFirstName.toCharArray();
		char[] nm = this.AuthorName.toCharArray();
		char[] cat = this.Category.toCharArray();
		char[] isbn2 = this.ISBN.toCharArray();
		char[] code = {fnm[0], fnm[1], nm[0], nm[1], cat[0], isbn2[isbn2.length-2], isbn2[isbn2.length-1]};
		String str = new String(code);
		this.Code = str;
	}
}
