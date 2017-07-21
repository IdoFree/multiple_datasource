package com.example.mutildatasource.repository.app;

import com.example.mutildatasource.entity.app.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ido on 2017/7/21.
 */
@Repository("teacher")
public interface TeacherRepo extends CrudRepository<Teacher,Long> {
}
