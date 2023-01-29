package container;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private String question;
	private Map<User, Answer> mp;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<User, Answer> getMp() {
		return mp;
	}

	public void setMp(Map<User, Answer> mp) {
		this.mp = mp;
	}

	public Question() {
	}

	public Question(String question, Map<User, Answer> mp) {
		super();
		this.question = question;
		this.mp = mp;
	}

	public void display() {
		System.out.println("Question : " + question);
		System.out.println("------Answers------");
		Set<Entry<User, Answer>> set = mp.entrySet();
		Iterator<Entry<User, Answer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<User, Answer> ob = it.next();
			Answer as = ob.getValue();
			User us = ob.getKey();
			System.out.println("Answer :");
			System.out.println(as);
			System.out.println("Posted by :");
			System.out.println(us);
			System.out.println(" ------------------------");
		}

	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", mp=" + mp + "]";
	}

}
