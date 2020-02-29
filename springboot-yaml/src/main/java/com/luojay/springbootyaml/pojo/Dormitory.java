package com.luojay.springbootyaml.pojo;

public class Dormitory {
    private String dormitoryName;
    private String dormitoryNo;

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }

    public String getDormitoryNo() {
        return dormitoryNo;
    }

    public void setDormitoryNo(String dormitoryNo) {
        this.dormitoryNo = dormitoryNo;
    }

    public Dormitory() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dormitory dormitory = (Dormitory) o;

        if (dormitoryName != null ? !dormitoryName.equals(dormitory.dormitoryName) : dormitory.dormitoryName != null)
            return false;
        return dormitoryNo != null ? dormitoryNo.equals(dormitory.dormitoryNo) : dormitory.dormitoryNo == null;
    }

    @Override
    public int hashCode() {
        int result = dormitoryName != null ? dormitoryName.hashCode() : 0;
        result = 31 * result + (dormitoryNo != null ? dormitoryNo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "dormitoryName='" + dormitoryName + '\'' +
                ", dormitoryNo='" + dormitoryNo + '\'' +
                '}';
    }
}
