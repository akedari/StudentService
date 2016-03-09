package com.proctor.backendservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ashekar on 3/6/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Professor {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id            ;
  private String firstname  ;
  private String lastname   ;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Override
  public String toString() {
    return "Professor{" +
      "id=" + id +
      ", firstname='" + firstname + '\'' +
      ", lastname='" + lastname + '\'' +
      '}';
  }
}
