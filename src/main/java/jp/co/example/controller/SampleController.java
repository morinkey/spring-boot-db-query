package jp.co.example.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.dao.SampleDao;
import jp.co.example.entity.Sample;

@RestController
public class SampleController {

    @Autowired
    private SampleDao sampleDao;
    
    @RequestMapping(method = RequestMethod.GET)
    @Transactional
    public List<Sample> get() {
        List<Sample> list = sampleDao.findName();
        list.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        return sampleDao.findAll();
    }
}
