package HW_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@DisplayName("Тесты для BookService")
public class BookServiceTest {

    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        bookRepository = mock(BookRepository.class); // Создаем мок-объект BookRepository
        bookService = new BookService(bookRepository); // Создаем экземпляр BookService, передавая мок-объект
    }

    @Test
    @DisplayName("Поиск по id")
    public void testFindById() {

        when(bookRepository.findById(anyString())).thenReturn(new Book("1")); // Устанавливаем, что при вызове findById с любым id книги должен вернуться объект книги

        assertTrue(bookService.findBookById("2") instanceof Book); // Вызываем метод findBookById с id = 2 и проверяем, что возвращается объект книги

        verify(bookRepository, times(1)).findById(anyString()); // Проверяем, что метод bookRepository.findById был вызван ровно один раз с любым id
    }

    @Test
    @DisplayName("Найти все")
    public void testFindAll() {

        when(bookRepository.findAll()).thenReturn(new ArrayList<>(10));  // Устанавливаем, что при вызове findAll должен вернуться пустой массив

        assertEquals(bookService.findAllBooks(), new ArrayList<>(10)); // Вызываем метод findAllBooks и проверяем, что он возвращает массив

        verify(bookRepository, times(1)).findAll(); // Проверяем, что метод bookRepository.findAll был вызван ровно один раз
    }
}
