package com.wzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzy.mapper.BmsBillboardMapper;
import com.wzy.mapper.BmsTipMapper;
import com.wzy.model.entity.BmsBillboard;
import com.wzy.model.entity.BmsTip;
import com.wzy.service.BmsBillboardService;
import com.wzy.service.BmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wzy173
 * @create 2022-09-2022/9/14 18:13
 */
@Service
@Slf4j
public class BmsTipServiceImpl extends ServiceImpl<BmsTipMapper
        , BmsTip> implements BmsTipService {

    @Resource
    private BmsTipMapper bmsTipMapper;

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e) {
            log.info("tip转化失败");
        }
        return todayTip;
    }
}
