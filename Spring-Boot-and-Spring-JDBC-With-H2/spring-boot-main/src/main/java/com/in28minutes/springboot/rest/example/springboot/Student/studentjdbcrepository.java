package com.in28minutes.springboot.rest.example.springboot.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class studentjdbcrepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    static class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setid(rs.getLong("id"));
            student.setname(rs.getString("name"));
            student.setpassportnumber(rs.getString("passport_number"));
            return student;
        }

    }

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student", new StudentRowMapper());
    }

    public Student findById(long id) {
        return jdbcTemplate.queryForObject("select * from student where id=?",
                new BeanPropertyRowMapper<>(Student.class), id);
    }

    public void deleteById(long id) {
        jdbcTemplate.update("delete from student where id=?", id);
    }

    public int insert(Student student) {
        return jdbcTemplate.update("insert into student (id, name, passport_number) " + "values(?,  ?, ?)",
                student.getid(), student.getname(), student.getpassportnumber());
    }

    public int update(Student student) {
        return jdbcTemplate.update("update student " + " set name = ?, passport_number = ? " + " where id = ?",
                student.getname(), student.getpassportnumber(), student.getid());
    }

}