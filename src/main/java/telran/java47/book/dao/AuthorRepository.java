package telran.java47.book.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import telran.java47.book.model.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, String> {
	
    @Query("SELECT DISTINCT b.publisher.publisherName FROM Book b JOIN b.authors a WHERE a.name = :authorName")
    List<String> findPublishersByAuthor(@Param("authorName") String authorName);
}
