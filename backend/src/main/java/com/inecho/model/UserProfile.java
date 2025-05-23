package com.inecho.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userProfiles")  // MongoDB collection mapping
public class UserProfile {

    @Id
    private String id;  // MongoDB ID field
    private String name;
    private String email;

    // Default constructor
    public UserProfile() {}

    // Constructor with fields
    public UserProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
