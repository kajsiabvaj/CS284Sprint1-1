package classModel;

import java.util.ArrayList;

public class Student {
	private String name;
	private String id;
	private boolean status;
	private ArrayList<String> subName;
	private ArrayList<Score> myScore;
	
	public Student(){
		
	}
	public Student(String n,String iD){
		name=n;
		id=iD;
		subName=new ArrayList<>();
		myScore=new ArrayList<>();
	}
	public void addSubject(String sub){
		subName.add(sub);
	}
	public void addScore(String sub,String typ,boolean mt,String n){
		myScore.add(new Score(sub,typ,mt,n));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ArrayList<String> getSubName() {
		return subName;
	}
//	public Score getScore(...){      get score to show own score on show score
//		
//	}
}
