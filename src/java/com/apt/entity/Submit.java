package com.apt.entity;
// Generated Mar 23, 2016 6:49:46 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Submit generated by hbm2java
 */
@Entity
@Table(name="submit"
    ,catalog="supportivelearning"
)
public class Submit  implements java.io.Serializable {


     private Integer submitId;
     private Assignment assignment;
     private Student student;
     private Short mark;
     private String feedback;
     private String url;

    public Submit() {
    }

	
    public Submit(Assignment assignment, Student student) {
        this.assignment = assignment;
        this.student = student;
    }
    public Submit(Assignment assignment, Student student, Short mark, String feedback, String url) {
       this.assignment = assignment;
       this.student = student;
       this.mark = mark;
       this.feedback = feedback;
       this.url = url;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="SubmitID", unique=true, nullable=false)
    public Integer getSubmitId() {
        return this.submitId;
    }
    
    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="AssignmentID", nullable=false)
    public Assignment getAssignment() {
        return this.assignment;
    }
    
    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="StudentID", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    
    @Column(name="Mark")
    public Short getMark() {
        return this.mark;
    }
    
    public void setMark(Short mark) {
        this.mark = mark;
    }

    
    @Column(name="Feedback", length=65535)
    public String getFeedback() {
        return this.feedback;
    }
    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    
    @Column(name="URL", length=65535)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


