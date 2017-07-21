package com.example.mutildatasource.entity.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ido on 2017/7/21.
 */
@Entity
@Table(name="test_teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
