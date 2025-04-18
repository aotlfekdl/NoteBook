package com.kh.boot.service;

import com.kh.boot.domain.vo.Attachment;
import com.kh.boot.domain.vo.Board;
import com.kh.boot.domain.vo.PageInfo;
import com.kh.boot.domain.vo.Reply;
import com.kh.boot.mappers.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@RequiredArgsConstructor //이게 Autowired 역할을 해줌
@Service
public class BoardServiceImpl  implements BoardService {
    private final BoardMapper boardMapper;

    @Override
    public int selectBoardCount() {
        return boardMapper.selectBoardCount();
    }

    @Override
    public ArrayList<Board> selectBoardList(PageInfo pi) {
        int offset = (pi.getCurrentPage() - 1)*pi.getBoardLimit();
        RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

        return boardMapper.selectBoardList(rowBounds);
    }

    @Override
    public int insertBoard(Board board) {
        return boardMapper.insertBoard(board);
    }



    @Override
    public int increaseCount(int boardNo) {
        return boardMapper.increaseCount(boardNo);
    }

    @Override
    public Board selectBoard(int boardNo) {
        return boardMapper.selectBoard(boardNo);
    }

    @Override
    public int insertReply(Reply reply) {
        return boardMapper.insertReply(reply);
    }

    @Override
    public ArrayList<Reply> selectReplyList(int boardNo) {
        return boardMapper.selectReplyList(boardNo);
    }

    @Override
    public ArrayList<Board> getBoardTopn(String orther, int limit) {
        RowBounds rowBounds = new RowBounds(0, limit);
        return boardMapper.getBoardTopn(rowBounds, orther);
    }

    @Override
    public int updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

    @Override
    public int insertAttachment1(Board board) {
        return boardMapper.insertAttachment1(board);
    }

    @Override
    public Board selectBoardNo() {
        return boardMapper.selectBoardNo();
    }

    @Override
    public ArrayList<Attachment> selectAttachment(int boardNo) {
        return boardMapper.selectAttachment(boardNo);
    }

    @Override
    public ArrayList<Board> selectThumbnailBoardList(PageInfo pi) {
        return boardMapper.selectThumbnailBoardList(pi);
    }


}
