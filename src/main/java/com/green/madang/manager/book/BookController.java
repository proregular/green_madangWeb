package com.green.madang.manager.book;

import com.green.madang.common.model.MyResponse;
import com.green.madang.manager.book.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/book")
@Tag(name = "도서", description = "도서 API")
public class BookController {
    private final BookService service;

    @PostMapping
    @Operation(summary = "도서 입고", description = "도서 입고 처리 API")
    public MyResponse<Integer> postBook(@RequestBody BookPostReq p) {
        // @Slf4j를 주면 맴버필드로 log 레퍼런스 변수를 선언해줌(내가 안만들어도)
        log.info("info {}", p);
        log.warn("warn");
        log.error("error");
        int result = service.insBook(p);
        String resultMassage = "책 등록 실패";

        if(result == 1) {
            resultMassage = "책 등록 완료";
        }

        MyResponse<Integer> res = new MyResponse<Integer>(resultMassage , result);

        return res;
    }

    @GetMapping
    @Operation(summary = "전체 도서 조회", description = "전체 도서 조회 처리 API")
    public MyResponse<List<BookGetRes>> getBookList(@ParameterObject @ModelAttribute BookGetReq p) {
        List<BookGetRes> list = service.getBookList(p);

        return new MyResponse<>(p.getPage() + " 페이지 데이터", list);


    }

    @PutMapping
    @Operation(summary = "도서 수정", description = "도서 수정 처리 API")
    public MyResponse<Integer> putBook(@RequestBody BookPutReq p) {
        int result = service.putBook(p);
        String resultMassage = "책 수정 실패";

        if(result == 1) {
            resultMassage = "책 수정 완료";
        }

        MyResponse<Integer> res = new MyResponse<Integer>(resultMassage , result);

        return res;
    }

    @DeleteMapping
    @Operation(summary = "도서 삭제", description = "도서 삭제 처리 API")
    public MyResponse<Integer> delBook(@ModelAttribute BookDelReq p) {
        int result = service.delBook(p);
        String resultMassage = "책 삭제 실패";

        if(result == 1) {
            resultMassage = "책 삭제 완료";
        }

        MyResponse<Integer> res = new MyResponse<Integer>(resultMassage , result);

        return res;
    }
}
