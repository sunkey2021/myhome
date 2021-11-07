package com.godcoder.myhome.BoardReository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godcoder.myhome.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
