package com.quangphuc.dao;

import com.quangphuc.model.Author;
import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    void create(Author author);
    void update(Author author);
    void delete(Author author);
    Optional<Author> findById(Long id);
    List<Author> findAll();
}
