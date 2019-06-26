package cn.zhou.entity;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private Integer course_id;
	private String course_name;
	private Double pass_score;

	private Set<Student> studentSet = new HashSet<Student>();

	public Set<Student> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}

	public Integer getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Double getPass_score() {
		return pass_score;
	}

	public void setPass_score(Double pass_score) {
		this.pass_score = pass_score;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", pass_score=" + pass_score
				+ ", studentSet=" + studentSet + "]";
	}

}
