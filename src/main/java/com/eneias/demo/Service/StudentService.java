package com.eneias.demo.Service;

import com.eneias.demo.dao.FakeStudentDaoImpl;
import com.eneias.demo.dao.StudentDao;
import com.eneias.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;

    }

    public int persitNewStudent(UUID studentId, Student student){
        UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
        return studentDao.insertNewStudent(studentUid, student);

    }

    public Student getStudentById(UUID studentId){
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents(){
        return studentDao.selectAllStudents();

    }

    public int updateStudentById(UUID studentId, Student studentUpdate){
        return studentDao.updateStudentById(studentId, studentUpdate);
    }

    public int deleteStudentById(UUID studentId){

        return studentDao.deleteStudentById(studentId);
    }

}

