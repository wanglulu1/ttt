package com.hpeu.oa.service;

import java.util.List;

public interface BaseService<T> {
	/**
     * 保存
     *
     * @param entity
     */
    void save(T entity);

    /**
     * 删除
     *
     * @param entity
     */
    void delete(T entity);

    /**
     * 修改
     *
     * @param entity
     */
    void update(T entity);

    /**
     * 通过id查询单挑数据
     *
     */
    T select(int id);

    /**
     * 查询所有哦数据
     * @return
     */
    List<T> getAll();
}
