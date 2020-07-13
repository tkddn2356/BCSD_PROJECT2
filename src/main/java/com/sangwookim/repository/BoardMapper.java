package com.sangwookim.repository;

import com.sangwookim.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    public List<Board> getList(String category);

}
