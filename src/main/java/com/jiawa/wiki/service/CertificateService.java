package com.jiawa.wiki.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.jiawa.wiki.domain.Certificate;
import com.jiawa.wiki.domain.CertificateExample;
import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.CertificateMapper;
import com.jiawa.wiki.mapper.TestMapper;
import com.jiawa.wiki.req.CertificateReq;
import com.jiawa.wiki.resp.CertificateResp;
import com.jiawa.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CertificateService {
    @Resource
    private CertificateMapper certificateMapper;
    public List<CertificateResp> list(CertificateReq req){
        CertificateExample certificateExample = new CertificateExample();
        CertificateExample.Criteria criteria = certificateExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Certificate> certificatelist = certificateMapper.selectByExample(certificateExample);
        List<CertificateResp> respList = new ArrayList<>();
//        for (Certificate certificate : certificatelist) {
//            CertificateResp certificateResp = new CertificateResp();
        //对象复制
//            certificateResp.setName(certificate.getName());
//            BeanUtils.copyProperties(certificate,certificateResp);
//            certificateResp.setJob("dddd");
//            respList.add(certificateResp);
//        }
        //列表复制
        List<CertificateResp> list = CopyUtil.copyList(certificatelist,CertificateResp.class);
        return list;
    }
}