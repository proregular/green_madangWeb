package com.green.madang.manager.book;

import com.green.madang.manager.book.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper mapper;

    public int insBook(BookPostReq p) {
        return mapper.insBook(p);
    }

    public List<BookGetRes> getBookList(BookGetReq p) {
        p.setStartIdx((p.getPage() - 1) * p.getSize());

        return mapper.selBookList(p);
    }

    public int putBook(BookPutReq p) {
        return mapper.updBook(p);
    }

    public int delBook(BookDelReq p) {
        return mapper.delBook(p);
    }
}
