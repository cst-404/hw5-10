package cn.gx.dao;

import cn.gx.entity.Quality;
import org.springframework.stereotype.Repository;

@Repository
public interface QualityMapper {
    //质检
    Integer qualityControl(Quality quality);
    //test
}
