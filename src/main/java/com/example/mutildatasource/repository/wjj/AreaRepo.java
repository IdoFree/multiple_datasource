package com.example.mutildatasource.repository.wjj;

import com.example.mutildatasource.entity.wjj.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ido on 2017/7/21.
 */
@Repository("area")
public interface AreaRepo  extends CrudRepository<Area,Long> {
}
