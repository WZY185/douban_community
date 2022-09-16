package com.wzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    public BmsTip getRandomTip();
}
