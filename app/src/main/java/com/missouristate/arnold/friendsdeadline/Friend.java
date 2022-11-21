package com.missouristate.arnold.friendsdeadline;

public class Friend {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String task;


    public Friend(int newId, String newFirstName, String newLastName, String newEmail, String newTask ) {
        setId( newId );
        setFirstName( newFirstName );
        setLastName( newLastName );
        setEmail( newEmail );
        setTask( newTask );
    }

    public void setId( int newId ) {
        id = newId;
    }

    public void setFirstName( String newFirstName ) {
        firstName = newFirstName;
    }

    public void setLastName( String newLastName ) {
        lastName = newLastName;
    }

    public void setEmail( String newEmail ) {
        email = newEmail;
    }

    public void setTask( String newTask ) {
        task = newTask;
    }


    public int getId( ) {
        return id;
    }

    public String getFirstName( ) {
        return firstName;
    }

    public String getLastName( ) {
        return lastName;
    }

    public String getEmail( ) {
        return email;
    }

    public String getTask( ) {
        return task;
    }

    public String toString( ) {
        return id + "; " + firstName + "; " + lastName + "; " + email + "; " + task;
    }
}