package com.zmc.dao;

import com.zmc.pojo.Items;

import java.util.List;

/**
 * 包名：com.zmc.dao
 *
 * @author zmc
 * 日期：2021/6/28  15:16
 */
public interface ItemsDao {
    List<Items> findAll();
}
