package com.tts.subscriberlist.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {

    // properties or fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String firstName; 
    private String lastName; 
    private String userName;


@Column
@CreationTimestamp
private Date signedUp;

    // defualt constructor (used if we pass in no arguements)
    public Subscriber(){
        
    }

    // new constructor (used when we pass in the parameter arguments)
    public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName= userName;
        this.signedUp = signedUp;
    }

    // generate getter and setters (but not id, bcause its supposed to stay the same)

  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignUP() {
        return signedUp;
    }

    public void setSignUP(Date signUP) {
        this.signedUp = signUP;
    }

    @Override
    public String toString() {
        return "Subscriber [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", signUP=" + signedUp
                + ", userName=" + userName + "]";
    }

    

    
}
