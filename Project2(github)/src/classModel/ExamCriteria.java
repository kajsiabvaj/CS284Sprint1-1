package classModel;

import java.util.ArrayList;

public class ExamCriteria {
	public class Exam {
		private String type;
		private double max, rate;// rate is a % of score max is a max score

		public Exam(String type, double max, double rate) {
			this.type = type;//ชื่อควิซ
			this.max = max;//คะแนนเต็ม ในแต่ละควิซ
			this.rate = rate;//เปอร์เซ็นที่คิด
		}
	}

	private String subName;//ชื่อวิชา
	private int numOfScore;//คะแนนที่ได้
	private ArrayList<Exam> scoreRate;//เก็บจำนวนสัดส่วนของวิชานั้นๆ เช่น midterm final quize1 

	public ExamCriteria() {
		
	}

	public ExamCriteria(String sub, int nos) {
		this.subName = sub;
		numOfScore = nos;
		scoreRate = new ArrayList<>();
	}

	public void addRate(String name, double max, double rate) {
		scoreRate.add(new Exam(name, max, rate));
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getNumOfScore() {
		return numOfScore;
	}

	public void setNumOfScore(int numOfScore) {
		this.numOfScore = numOfScore;
	}

	public ArrayList<Exam> getScoreRate() {
		return scoreRate;
	}

	public void setScoreRate(ArrayList<Exam> scoreRate) {
		this.scoreRate = scoreRate;
	}
	
	// public void writeFile(){
	//
	// }
}
