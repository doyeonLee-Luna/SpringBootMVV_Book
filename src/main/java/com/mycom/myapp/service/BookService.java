package com.mycom.myapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.mycom.myapp.dto.BookDto;

@Service
public class BookService {
    private List<BookDto> bookList = new ArrayList<>();

    public BookService() {
        // 초기 데이터 추가 (테스트용)
        bookList.add(new BookDto(1, "Spring Boot Guide", "TechPress", 30000));
        bookList.add(new BookDto(2, "Java for Beginners", "CodeHouse", 25000));
        bookList.add(new BookDto(3, "Database Essentials", "DBWorld", 28000));
    }

    // 전체 책 목록 조회
    public List<BookDto> getAllBooks() {
        return bookList;
    }

    // 특정 책 조회
    public BookDto getBookById(int bookid) {
        return bookList.stream()
                .filter(book -> book.getBookid() == bookid)
                .findFirst()
                .orElse(null);
    }

    // 책 추가
    public void addBook(BookDto book) {
        bookList.add(book);
    }

    // 책 삭제
    public void deleteBook(int bookid) {
        bookList.removeIf(book -> book.getBookid() == bookid);
    }
}
