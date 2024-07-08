package com.leonardoalmd.app;

public class User {
    private String name;
    private Integer age;
    private String email;
    private String password;

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public void setPassword(String password) {
        this.password = password.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
