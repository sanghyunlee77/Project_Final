package com.example.board;

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
    JdbcTemplate jdbcTemplate;

    // BoardRowMapper class
    private static class BoardRowMapper implements RowMapper<BoardVO> {
        @Override
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardVO vo = new BoardVO();
            vo.setId(rs.getInt("id"));
            vo.setRname(rs.getString("Rname"));
            vo.setFname(rs.getString("Fname"));
            vo.setPeople(rs.getInt("People"));
            vo.setKind(rs.getString("Kind"));
            vo.setPnumber(rs.getString("Pnumber"));
            vo.setMeetday(rs.getString("Meetday"));
            vo.setRegdate(rs.getString("regdate"));
            vo.setStar(rs.getInt("star"));
            vo.setContents(rs.getString("contents"));
            return vo;
        }
    }

    // Existing methods...

    public int insertBoard(BoardVO vo) {
        String sql = "INSERT INTO BOARD (Rname, Fname, People, Kind, Pnumber, Meetday, regdate, star, contents) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                vo.getRname(),
                vo.getFname(),
                vo.getPeople(),
                vo.getKind(),
                vo.getPnumber(),
                vo.getMeetday(),
                vo.getRegdate(),
                vo.getStar(),
                vo.getContents());
    }

    public List<BoardVO> getBoardList() {
        String sql = "SELECT * FROM BOARD ORDER BY id DESC";
        return jdbcTemplate.query(sql, new BoardRowMapper());
    }

    public BoardVO getBoard(int id) {
        String sql = "SELECT * FROM BOARD WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BoardRowMapper());
    }

    public int updateBoard(BoardVO vo) {
        String sql = "UPDATE BOARD SET Rname=?, Fname=?, People=?, Kind=?, Pnumber=?, Meetday=?, regdate=?, star=?, contents=? " +
                "WHERE id=?";
        return jdbcTemplate.update(sql,
                vo.getRname(),
                vo.getFname(),
                vo.getPeople(),
                vo.getKind(),
                vo.getPnumber(),
                vo.getMeetday(),
                vo.getRegdate(),
                vo.getStar(),
                vo.getContents(),
                vo.getId());
    }

    public int deleteBoard(int id) {
        String sql = "DELETE FROM BOARD WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }
}
