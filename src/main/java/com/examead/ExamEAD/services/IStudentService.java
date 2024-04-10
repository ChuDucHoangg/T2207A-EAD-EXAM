package com.examead.ExamEAD.services;

import com.examead.ExamEAD.dtos.StudentDTO;
import com.examead.ExamEAD.dtos.StudentInformation;
import com.examead.ExamEAD.dtos.StudentScoreDTO;
import com.examead.ExamEAD.models.CreateScoreStudent;
import com.examead.ExamEAD.models.CreateStudent;

import java.util.List;

public interface IStudentService {
    List<StudentInformation> getInformationStudents();
    StudentDTO create(CreateStudent model);
    StudentScoreDTO insertScore(CreateScoreStudent model);
}
