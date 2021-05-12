package cn.gx.dao;

import cn.gx.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    List<Product> queryBypName(Product product);

    Product queryById(int id);

    Integer update(Product product);
}
