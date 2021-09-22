package com.psl.training.Employee_Management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InternshipProfile")
public class InternshipProfile {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long internshipProfile_id;

		private String title;

		private String domain;

		private String description;

		private int duration;
		
		public InternshipProfile() {
			
		}

		public InternshipProfile(String title, String domain, String description, int duration) {
			super();
			this.title = title;
			this.domain = domain;
			this.description = description;
			this.duration = duration;
		}

		public Long getInternshipProfile_id() {
			return internshipProfile_id;
		}

		public void setInternshipProfile_id(Long internshipProfile_id) {
			this.internshipProfile_id = internshipProfile_id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDomain() {
			return domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}
		
	
}
