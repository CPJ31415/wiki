package com.huajuan.wiki.service;

import com.huajuan.wiki.domain.Ebook;
import com.huajuan.wiki.domain.EbookExample;
import com.huajuan.wiki.mapper.EbookMapper;
import com.huajuan.wiki.req.EbookReq;
import com.huajuan.wiki.resp.EbookResp;
import com.huajuan.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {

        //固定写法
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
