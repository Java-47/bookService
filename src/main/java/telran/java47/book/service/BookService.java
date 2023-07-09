package telran.java47.book.service;

import java.util.List;

import telran.java47.book.dto.AuthorDto;
import telran.java47.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);

	BookDto findBookByIsbn(String isbn);

	BookDto removeBook(String isbn);

	BookDto updateBookTitle(String isbn, String title);

	List<BookDto> findBooksByAuthor(String author);

	List<BookDto> findBooksByPublisher(String publisher);

	List<AuthorDto> findBookAuthors(String isbn);

	List<String> findPublishersByAuthor(String authorName);

	AuthorDto removeAuthor(String authorName);

}
