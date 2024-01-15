package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


class BookServiceTest {

    private BookRepository bookRepository;


    @BeforeEach
    void setup() {
        bookRepository = mock(BookRepository.class);
    }

    @Test
    void findBookById() {
        when(bookRepository.findById(anyString())).thenReturn(new Book("1", "title", "author"));
        Book result = bookRepository.findById("2");
        BookService bookService = new BookService(bookRepository);

        assertThat(bookService.findBookById("2").getId()).isEqualTo(result.getId());
    }

    @Test
    void findAllBooks() {
        when(bookRepository.findAll()).thenReturn(new ArrayList<>(Arrays.asList(
                new Book("1", "title", "author"),
                new Book("2", "title2", "author2"),
                new Book("3", "title3", "author3"))));
        BookService bookService = new BookService(bookRepository);
        bookService.findAllBooks();
        verify(bookRepository).findAll();
    }
}