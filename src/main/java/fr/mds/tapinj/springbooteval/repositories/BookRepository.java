package fr.mds.tapinj.springbooteval.repositories;


import fr.mds.tapinj.springbooteval.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
