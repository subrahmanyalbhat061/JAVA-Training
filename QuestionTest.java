
public class QuestionTest {

	public static void main(String[] args) {
		Question q1=new Question(1,"What is Java","Theory","Easy",2);
		System.out.println(q1);
		
	}

}
class Question{
	private int questionId;
	private String question;
	private String questionType;
	private String level;
	private int marks;
	
	

	public Question(int questionId, String question, String questionType, String level, int marks) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.questionType = questionType;
		this.level = level;
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", questionType=" + questionType
				+ ", level=" + level + ", marks=" + marks + "]";
	}

	
	
}