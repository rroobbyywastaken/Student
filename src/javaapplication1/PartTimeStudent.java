/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Hp
 */
public class PartTimeStudent extends Student{
    
    private int noOfCourse;

    public int getNoOfCourse() {
        return noOfCourse;
    }

    public void setNoOfCourse(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }

    public PartTimeStudent(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }
    
   
}