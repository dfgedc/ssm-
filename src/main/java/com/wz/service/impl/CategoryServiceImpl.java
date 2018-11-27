package com.wz.service.impl;

import com.wz.mapper.CategoryMapper;
import com.wz.pojo.Category;
import com.wz.pojo.CategoryExample;
import com.wz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        List<Category> categories= categoryMapper.selectByExample(example);
        return categories;
    }


    @Override
    public Category get(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Category category) {
            categoryMapper.updateByPrimaryKey(category);
    }
}
