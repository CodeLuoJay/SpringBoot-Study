package com.luojay.springbootyaml.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties( prefix = "student")
public class Student {
    private String studentName;
    private String studentId;
    private Map<String,String> studentInfo;
    private List<Object> major;
    private Dormitory dormitory;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Map<String, String> getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(Map<String, String> studentInfo) {
        this.studentInfo = studentInfo;
    }

    public List<Object> getMajor() {
        return major;
    }

    public void setMajor(List<Object> major) {
        this.major = major;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public void setDormitory(Dormitory dormitory) {
        this.dormitory = dormitory;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (studentId != null ? !studentId.equals(student.studentId) : student.studentId != null) return false;
        if (studentInfo != null ? !studentInfo.equals(student.studentInfo) : student.studentInfo != null) return false;
        if (major != null ? !major.equals(student.major) : student.major != null) return false;
        return dormitory != null ? dormitory.equals(student.dormitory) : student.dormitory == null;
    }

    @Override
    public int hashCode() {
        int result = studentName != null ? studentName.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (studentInfo != null ? studentInfo.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (dormitory != null ? dormitory.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentInfo=" + studentInfo +
                ", major=" + major +
                ", dormitory=" + dormitory +
                '}';
    }
}
