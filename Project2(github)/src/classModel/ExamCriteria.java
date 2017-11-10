package classModel;

import java.util.ArrayList;

public class ExamCriteria {
	public class Exam {
		private String type;
		private double max, rate;// rate is a % of score max is a max score

		public Exam(String type, double max, double rate) {
			this.type = type;//���ͤ�ԫ
			this.max = max;//��ṹ��� ����Ф�ԫ
			this.rate = rate;//�����繷��Դ
		}
	}

	private String subName;//�����Ԫ�
	private int numOfScore;//��ṹ�����
	private ArrayList<Exam> scoreRate;//�纨ӹǹ�Ѵ��ǹ�ͧ�Ԫҹ��� �� midterm final quize1 

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
