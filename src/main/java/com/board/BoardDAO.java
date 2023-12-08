package com.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    SqlSession sqlSession;
    //
//    public int insertBoard(BoardVO data){
//        int result
//
//    }
//
//    // 글 삭제
//    public int deleteBoard(int seq) {
//        String sql = "delete from BOARD where seq = "+ seq;
//        return sqlSession.update(sql);
//    }
//    public int updateBoard(BoardVO vo) {
//        String sql = "update BOARD set title='"+vo.getTitle()+"'/"
//                +"title='"+vo.getTitle()+"',"
//                +"writer'"+vo.getWriter()+"',"
//                +"content'"+vo.getContent() + "' where seq =" + vo.getSeq();
//        return sqlSession.update(sql);
//    }
//    class BoardRowMapper implements RowMapper<BoardVO> {
//
//        @Override
//        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//            BoardVO vo = new BoardVO();
//            vo.setSeq(rs.getInt("seq"));
//            vo.setTitle(rs.getString("title"));
//            vo.setContent(rs.getString("content"));
//            vo.setWriter(rs.getString("writer"));
//            vo.setRegdate(rs.getDate("regdate"));
//            return vo;
//        }
//    }
//
//    public BoardVO getBoard(int seq){
//        String sql = "select * from BOARD where seq = "+seq;
//        return jdbcTemplate.queryForObject(sql,new BoardRowMapper());
//    }
//
//    public List<BoardVO> getBoardList(){
//        String sql = "select * from BOARD order by regdate desc";
//        return jdbcTemplate.query(sql,new BoardRowMapper());
//    }
//    public BoardVO getBoard(int seq){
//        BoardVO one = sqlSession.selectOne("Board.getBoard",seq);
//        return one;
//    }
    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
}
