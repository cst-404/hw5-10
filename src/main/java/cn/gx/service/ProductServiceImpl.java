package cn.gx.service;

import cn.gx.dao.ProductMapper;
import cn.gx.entity.Product;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper mapper;

    @Override
    public List<Product> queryBypName(Product product) {
        PageHelper.startPage(1, 3);
        return mapper.queryBypName(product);
    }

    @Override
    public Product queryById(int id) {
        return mapper.queryById(id);
    }

    @Override
    public Integer update(Product product) {
        return mapper.update(product);
    }
}
