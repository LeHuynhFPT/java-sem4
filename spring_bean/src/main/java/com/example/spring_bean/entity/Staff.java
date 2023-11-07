package com.example.spring_bean.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Staff {
    private long id;
    private String name;
    private String address;
    private Department department;

    public Staff(long id, String name, String address, Department department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.department = department;
    }

    @Override
    public String toString(){
        return "Name : "+name + "Address :" +address;
    }
}
