package com.zmc.service.impl;

import com.zmc.dao.ItemsDao;
import com.zmc.pojo.Items;
import com.zmc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包名：com.zmc.service.impl
 *
 * @author zmc
 * 日期：2021/6/28  15:32
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
