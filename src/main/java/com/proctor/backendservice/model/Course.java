package com.proctor.backendservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by ashekar on 3/6/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String coursename;
  private Timestamp startduration;
  private Timestamp endduration;
  private int courseduration;
  private String days;

  public void Course() {
  }



  @Override
  public String toString() {
    return "Course{" +
      "id=" + id +
      ", coursename='" + coursename + '\'' +
      ", startduration=" + startduration +
      ", endduration=" + endduration +
      ", courseduration=" + courseduration +
      ", days='" + days + '\'' +
      '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCoursename() {
    return coursename;
  }

  public void setCoursename(String coursename) {
    this.coursename = coursename;
  }

  public Timestamp getStartduration() {
    return startduration;
  }

  public void setStartduration(Timestamp startduration) {
    this.startduration = startduration;
  }

  public Timestamp getEndduration() {
    return endduration;
  }

  public void setEndduration(Timestamp endduration) {
    this.endduration = endduration;
  }

  public int getCourseduration() {
    return courseduration;
  }

  public void setCourseduration(int courseduration) {
    this.courseduration = courseduration;
  }

  public String getDays() {
    return days;
  }

  public void setDays(String days) {
    this.days = days;
  }
}
