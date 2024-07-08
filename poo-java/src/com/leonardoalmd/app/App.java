package com.leonardoalmd.app;

public class App {
    public static void main(String[] args) {
        User userA = new User();

        userA.setName("Leonardo");
        userA.setAge(18);
        userA.setEmail("leonardoalmd8@gmail.com");
        userA.setPassword("leonardo123");

        System.out.println(userA.getName());
        System.out.println(userA.getAge());
        System.out.println(userA.getEmail());
        System.out.println(userA.getPassword());

    }
}
