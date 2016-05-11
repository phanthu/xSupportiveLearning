package com.apt.entity;
// Generated Mar 23, 2016 6:49:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Assignment generated by hbm2java
 */
@Entity
@Table(name="assignment"
    ,catalog="supportivelearning"
)
public class Assignment  implements java.io.Serializable {


     private Integer assignmentId;
     private Batch batch;
     private Subject subject;
     private String assignmentName;
     private Date startTime;
     private Date endTime;
     private byte status;
     private String url;
     private Set<Submit> submits = new HashSet<Submit>(0);

    public Assignment() {
    }

	
    public Assignment(Batch batch, Subject subject, String assignmentName, Date startTime, Date endTime, byte status) {
        this.batch = batch;
        this.subject = subject;
        this.assignmentName = assignmentName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }
    public Assignment(Batch batch, Subject subject, String assignmentName, Date startTime, Date endTime, byte status, String url, Set<Submit> submits) {
       this.batch = batch;
       this.subject = subject;
       this.assignmentName = assignmentName;
       this.startTime = startTime;
       this.endTime = endTime;
       this.status = status;
       this.url = url;
       this.submits = submits;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="AssignmentID", unique=true, nullable=false)
    public Integer getAssignmentId() {
        return this.assignmentId;
    }
    
    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="BatchID", nullable=false)
    public Batch getBatch() {
        return this.batch;
    }
    
    public void setBatch(Batch batch) {
        this.batch = batch;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="SubjectID", nullable=false)
    public Subject getSubject() {
        return this.subject;
    }
    
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    
    @Column(name="AssignmentName", nullable=false, length=50)
    public String getAssignmentName() {
        return this.assignmentName;
    }
    
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="StartTime", nullable=false, length=19)
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EndTime", nullable=false, length=19)
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    
    @Column(name="Status", nullable=false)
    public byte getStatus() {
        return this.status;
    }
    
    public void setStatus(byte status) {
        this.status = status;
    }

    
    @Column(name="URL", length=65535)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="assignment")
    public Set<Submit> getSubmits() {
        return this.submits;
    }
    
    public void setSubmits(Set<Submit> submits) {
        this.submits = submits;
    }




}


