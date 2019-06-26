package cn.zhou.entity;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private Integer stu_id;
	private String stu_name;
	private Double stu_score;

	private Set<Course> courseSet = new HashSet<Course>();

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_score=" + stu_score + ", courseSet="
				+ courseSet + "]";
	}

	public Set<Course> getCourseSet() {
		return courseSet;
	}

	public void setCourseSet(Set<Course> courseSet) {
		this.courseSet = courseSet;
	}

	public Integer getStu_id() {
		return stu_id;
	}

	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public Double getStu_score() {
		return stu_score;
	}

	public void setStu_score(Double stu_score) {
		this.stu_score = stu_score;
	}

}
