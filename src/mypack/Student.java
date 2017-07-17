package mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table
public class Student {
private int rollno;
private String name;
private int age;
private String email;
/**
 * @return the rollno
 */
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public int getRollno() {
	return rollno;
}
/**
 * @param rollno the rollno to set
 */
public void setRollno(int rollno) {
	this.rollno = rollno;
}
/**
 * @return the name
 */
@NotEmpty(message="name can not be empty")
@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
@Range(min=18,max=30,message="age should be between {min} and {max}")
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the email
 */
@NotEmpty(message="email can not be empty")
@Email(message="invalid email id")
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}


}
