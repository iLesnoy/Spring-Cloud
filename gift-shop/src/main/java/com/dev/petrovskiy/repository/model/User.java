package com.dev.petrovskiy.repository.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@EqualsAndHashCode
@ToString
@Document(collection = "users")
public class User {
    @Id
    private String id;
    @Field(value = "name")
    private String name;
    @Field(value = "surname")
    private String surname;
    @Field(value = "age")
    private long age;


    public User(String name, String surname, long age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}

