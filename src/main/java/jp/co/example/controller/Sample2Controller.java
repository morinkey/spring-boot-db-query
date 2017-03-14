package jp.co.example.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.dao.Sample2Dao;
import jp.co.example.entity.Sample;

@RequestMapping("2")
@RestController
public class Sample2Controller {

    @Autowired
    private Sample2Dao sample2Dao;
    
    @RequestMapping(method = RequestMethod.GET)
    @Transactional
    public List<Sample> get() {
        List<Sample> list1 = sample2Dao.findById1();
        System.out.println("メソッド：findById1");
        list1.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        
        List<Sample> list2 = sample2Dao.findById2();
        System.out.println("メソッド：findById2");
        list2.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        
        List<Sample> list3 = sample2Dao.findById3();
        System.out.println("メソッド：findById3");
        list3.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        
        List<Sample> list4 = sample2Dao.findById4(new Integer(1));
        System.out.println("メソッド：findById4");
        list4.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        
        List<Sample> list5 = sample2Dao.findById5(new Integer(1));
        System.out.println("メソッド：findById5");
        list5.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        
        List<Sample> list6 = sample2Dao.findByLikeName("te");
        System.out.println("メソッド：findByLikeName");
        list6.stream()
          .forEach(e -> System.out.println("ID : " + e.getId() + " name : " + e.getName()));
        return list1;
    }
}
