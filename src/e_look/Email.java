package e_look;

import java.time.LocalDate;

public class Email {
	public String from;
	public String subject;
	public LocalDate date;
	public Priority priority;
	public String text;

	public Email(String from,String subject,LocalDate date,Priority priority,String text) {
		this.from=from;
		this.subject=subject;
		this.date=date;
		this.priority=priority;
		this.text=text;
	}
}
