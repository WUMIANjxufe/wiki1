package com.jiawa.wiki.controller;

import com.jiawa.wiki.req.CertificateReq;
import com.jiawa.wiki.resp.CertificateResp;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/certificate")
public class CertificateController {
    @Autowired
    private CertificateService certificateService;
    @GetMapping("/list")
    public CommonResp list(CertificateReq req){
        CommonResp<List<CertificateResp>> resp = new CommonResp<>();
        List<CertificateResp> list = certificateService.list(req);
        resp.setContent(list);
        return resp;
    }

}
