package com.example.testtask.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest{
        String login="User";
        String email="dsdfsf@saaa.ru";
        String invalidLogin="";
        String invalidEmail="schildexcomtest";
        User userTest=new User(login,email);

@Test
    void shouldCreateWithParameters(){
            Assertions.assertEquals(login,userTest.getLogin());
            Assertions.assertEquals(email,userTest.getEmail());
            }

@Test
    void shouldCreateWithoutParameters(){
            User userWithNoParamsTest=new User();
            Assertions.assertNull(userWithNoParamsTest.getLogin());
            Assertions.assertNull(userWithNoParamsTest.getEmail());

            }

@Test
    void shouldValidateCharsInEmail(){
            Assertions.assertThrows(IllegalAccessError.class,()->{
        new User(login,invalidEmail);
        },"E-mail должен быть недействительным, чтобы вызвать исключение для прохождения теста");
        }

@Test
    void shouldValidateCharsInLogin(){
            Assertions.assertThrows(IllegalAccessError.class,()->{
        new User(invalidLogin,email);
        }," Логин должен быть недействительным, чтобы вызвать исключение для прохождения теста");
        }

@Test
    void shouldCheckThatLoginAndEmailAreNotEqual(){
            Assertions.assertNotEquals(userTest.getEmail(),userTest.getLogin());
            }
            }