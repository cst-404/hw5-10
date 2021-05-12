package cn.gx.service;

import cn.gx.dao.QualityMapper;
import cn.gx.entity.Quality;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QualityServiceImpl implements QualityService {
    @Resource
    private QualityMapper mapper;

    @Override
    public Integer qualityControl(Quality quality) {
        return mapper.qualityControl(quality);
    }
}
