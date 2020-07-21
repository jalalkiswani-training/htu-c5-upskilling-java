package edu.htu.upskilling.java.lecture5;

public class Files2 {
	public static void main(String[] args) {
		String newLine=System.getProperty("line.separator");
		String marksString=Files1.readFile("marks.csv");
		String students[]=marksString.split(newLine);
		
		for (int i = 0; i < students.length; i++) {
			String student = students[i];
			System.out.println("Student Info: "+student);			
		}
		
		for (String student: students) {
			String[] studentInfo = student.split(",");
			String name=studentInfo[0];
			int sum=0;
			for(int i=1;i<studentInfo.length;i++) {
				int mark=Integer.parseInt(studentInfo[i]);
				sum+=mark;				
			}
			int avg=sum/(studentInfo.length-1);
			System.out.println("Student "+name+" sum ="+sum+" avg= "+avg);
		}
	}
}
