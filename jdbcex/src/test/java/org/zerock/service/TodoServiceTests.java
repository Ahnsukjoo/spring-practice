package org.zerock.service;

import com.sun.tools.javac.comp.Todo;
import java.time.LocalDate;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

@Log4j2
public class TodoServiceTests {

    private TodoService todoService;

    @BeforeEach
    public void ready() {
        todoService = TodoService.INSTANCE;
    }

    @Test
    public void testRegister() throws Exception {
        TodoDTO todoDTO = TodoDTO.builder()
            .title("JDBC Test Title2")
            .dueDate(LocalDate.now())
            .build();

        log.info("---------------------------------------");
        log.info(todoDTO);

        todoService.register(todoDTO);
    }

}
