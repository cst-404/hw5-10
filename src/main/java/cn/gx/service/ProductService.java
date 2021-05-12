package cn.gx.service;

import cn.gx.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> queryBypName(Product product);

    Product queryById(int id);

    Integer update(Product product);
}
