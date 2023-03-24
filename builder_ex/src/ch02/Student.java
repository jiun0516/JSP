package ch02;

public class Student {

	private String name;
	private int grade;
	
	private Student() {}
	
	public static class StudentBuilder {
		
		private String name;
		private int grade;
		
		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public StudentBuilder setGrade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public Student build() {
			Student student = new Student();
			student.name = name;
			student.grade = grade;
			return student;
		}
	}
	
	public static void main(String[] args) {
		
		Student student1 = new StudentBuilder().setName("신짱구").setGrade(1).build();
		Student student2 = new StudentBuilder().setName("김철수").setGrade(2).build();
		
	}
}
