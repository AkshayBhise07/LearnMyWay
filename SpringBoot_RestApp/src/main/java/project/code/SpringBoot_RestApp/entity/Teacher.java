package project.code.SpringBoot_RestApp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="teacher_info")
public class Teacher {
	
	
	    @Id
	    @GeneratedValue(strategy =GenerationType.IDENTITY )
	    private int teacher_id;
		
		private String first_name;
		
		private String last_name;
		
		private String email;
		
		private String password;
		
		private String mobile;
		
		private String education;
		
		private String experience;
		
	    private String imageURL;
		
		private Address address_id;

		public int getTeacher_id() {
			return teacher_id;
		}

		public void setTeacher_id(int teacher_id) {
			this.teacher_id = teacher_id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}

		public String getExperience() {
			return experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}

		public String getImageURL() {
			return imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

		public Address getAddress_id() {
			return address_id;
		}

		public void setAddress_id(Address address_id) {
			this.address_id = address_id;
		}

		@Override
		public String toString() {
			return "Teacher [teacher_id=" + teacher_id + ", first_name=" + first_name + ", last_name=" + last_name
					+ ", email=" + email + ", password=" + password + ", mobile=" + mobile + ", education=" + education
					+ ", experience=" + experience + ", imageURL=" + imageURL + ", address_id=" + address_id + "]";
		}
		
		
		

}
