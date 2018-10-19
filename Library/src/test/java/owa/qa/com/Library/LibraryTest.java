package owa.qa.com.Library;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

	@Test
	public void itemTest() {
	String ItemID = "123";
	String ItemName =  "Book";
	Library item =  new Library(ItemID, ItemName);
	assertEquals("123", item.getID(ItemID)); //creat getters and setters for item
	assertEquals("Book", item.getname(ItemName));	
	}
	
	@Test
	public void BooksTest() {
		String ISBN= "543210";
		String ItemName = "The Last Lecture";
		String ItemID = "543";
		Books book =  new Books(ISBN, ItemName, ItemID);
		assertEquals("543210", book.getISBN(ISBN));
		assertEquals("The Last Lecture", book.getItemName(ItemName));
		assertEquals("543", book.getItemID(ItemID));
	}
	
	@Test
	public void MediaResourcesTest() {
		String IssueDate = "12/5/15";
		String ItemName = "Microphone";
		String ItemID= "654";
		MediaResource mediaresource = new MediaResource("12/5/15", mediaresource.getIssueDate(IssueDate));
		assertEquals("12/5/15", mediaresource.getIssueDate(IssueDate));
		assertEquals("Microphone", mediaresource.getItemName(ItemName));
		assertEquals("654", mediaresource.getItemID(ItemID));
	}
	
	@Test
	public void DissertationTest() {
		String DateofCompletion = "19/10/1994";
		String Author =  "Lalita Chopra";
		String Topic = "Android Application";
		 
	}
}
