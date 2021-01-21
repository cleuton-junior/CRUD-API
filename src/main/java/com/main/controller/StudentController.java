package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.service.Student_Service;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class StudentController {

	@Autowired
	private Student_Service studentService;

	@PostMapping("save-student")
	public boolean saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping("students-list")
	public List<Student> allStudents() {
		return studentService.getStudents();
	}

	@DeleteMapping("delete-student/{student_id}")
	public boolean deleteStudent(@PathVariable("student_id") int student_id, Student student) {
		student.setStudent_id(student_id);
		return studentService.deleteStudent(student);
	}

	@GetMapping("aluno / {aluno_id}")
	public List<Student> allstudentByID(@PathVariable("student_id") int student_id, Student student) {
		student.setStudent_id(student_id);
		return studentService.getStudentByID(student);

	}

	@PostMapping("update-student / {student_id}")
	public boolean updateStudent(@RequestBody Student student, @PathVariable("student_id") int student_id) {
		student.setStudent_id(student_id);
		return studentService.updateStudent(student);
	}

}
