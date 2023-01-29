package container;

public class Answer {
	private String answer, date;

	public Answer() {
	}

	public Answer(String answer, String date) {
		super();
		this.answer = answer;
		this.date = date;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "answer=" + answer + ", date=" + date;
	}

}
