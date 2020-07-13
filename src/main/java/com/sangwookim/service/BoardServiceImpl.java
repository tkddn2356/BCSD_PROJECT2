package com.sangwookim.service;

import com.sangwookim.domain.Board;
import com.sangwookim.repository.BoardMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j
public class BoardServiceImpl implements BoardService {

    @Autowired
    private  BoardMapper mapper;

    @Override
    public List<Board> getList(String category) {
        log.info("getList.......");
        return mapper.getList(category);
    }
}
