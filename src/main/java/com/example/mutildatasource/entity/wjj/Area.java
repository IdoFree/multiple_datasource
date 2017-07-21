package com.example.mutildatasource.entity.wjj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ido on 2017/7/21.
 */
@Entity
@Table(name="test_area")
public class Area {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
