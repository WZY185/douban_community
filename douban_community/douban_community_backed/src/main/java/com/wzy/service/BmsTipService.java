package com.wzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzy.model.entity.BmsBillboard;
import com.wzy.model.entity.BmsTip;

/**
 * @author wzy173
 * @create 2022-09-2022/9/14 18:12
 */
public interface BmsTipService extends IService<BmsTip> {
    public BmsTip getRandomTip();
}
