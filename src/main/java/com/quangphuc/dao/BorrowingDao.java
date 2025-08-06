package com.quangphuc.dao;

import java.util.Optional;

import com.quangphuc.model.Borrowing;
import java.util.List;

public interface BorrowingDao {
    void create(Borrowing borrowing);

    void update(Borrowing borrowing);

    void delete(Borrowing borrowing);

    Optional<Borrowing> findById(Long id);

    List<Borrowing> findAll();
    // Additional methods can be added as needed
}
