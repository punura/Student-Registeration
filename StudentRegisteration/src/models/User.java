package models;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class User {

	private StringProperty studentID;
	private StringProperty studentName;
	private StringProperty birthDate;
	private StringProperty subject;
	private StringProperty phoneNumber;

	public User() {
		studentID = new SimpleStringProperty(this, "studentID");
		studentName = new SimpleStringProperty(this, "studentName");
		birthDate = new SimpleStringProperty(this, "birthDate");
		subject = new SimpleStringProperty(this, "subject");
		phoneNumber = new SimpleStringProperty(this, "phoneNumber");
	}

	public StringProperty studentIDProperty() {
		return studentID;
	}

	public void setStudentID(String newsStudentID) {
		studentID.set(newsStudentID);
	}

	public String getStudentID() {
		return studentID.get();
	}

	public StringProperty studentNameProperty() {
		return studentName;
	}

	public void setStudentName(String newsStudentName) {
		studentName.set(newsStudentName);
	}

	public String getStudentName() {
		return studentName.get();
	}

	public StringProperty birthDateProperty() {
		return birthDate;
	}

	public void setBirthDate(String newsStudentBirthDate) {
		birthDate.set(newsStudentBirthDate);
	}

	public String getBirthDate() {
		return birthDate.get();
	}

	public StringProperty subjectProperty() {
		return subject;
	}

	public void setSubject(String newsSubject) {
		subject.set(newsSubject);
	}

	public String getSubject() {
		return subject.get();
	}

	public StringProperty phoneNumberProperty() {
		return phoneNumber;
	}

	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber.set(newPhoneNumber);
	}

	public String getPhoneNumber() {
		return phoneNumber.get();
	}

}
