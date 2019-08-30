package com.riddhi.pptool.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Project {

		@Id
		@GeneratedValue
		private Long id;
		private String projectName;
		private String prohectIdentifier;
		private String description;
		private Date start_date;
		private Date end_date;
		
		private Date create_At;
		private Date updated_At;
		
		public Project() {
		
		}
		
		
		@Override
		public String toString() {
			return "project [id=" + id + ", projectName=" + projectName + ", prohectIdentifier=" + prohectIdentifier
					+ ", description=" + description + ", start_date=" + start_date + ", end_date=" + end_date
					+ ", create_At=" + create_At + ", updated_At=" + updated_At + "]";
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getProjectName() {
			return projectName;
		}


		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}


		public String getProhectIdentifier() {
			return prohectIdentifier;
		}


		public void setProhectIdentifier(String prohectIdentifier) {
			this.prohectIdentifier = prohectIdentifier;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Date getStart_date() {
			return start_date;
		}


		public void setStart_date(Date start_date) {
			this.start_date = start_date;
		}


		public Date getEnd_date() {
			return end_date;
		}


		public void setEnd_date(Date end_date) {
			this.end_date = end_date;
		}


		public Date getCreate_At() {
			return create_At;
		}


		public void setCreate_At(Date create_At) {
			this.create_At = create_At;
		}


		public Date getUpdated_At() {
			return updated_At;
		}


		public void setUpdated_At(Date updated_At) {
			this.updated_At = updated_At;
		}


		@PrePersist
		protected void onCreate() {
			this.create_At = new Date();
		}
		
		@PrePersist
		protected void onUpdate() {
			this.updated_At = new Date();
		}
		
		
		
		
		
}
