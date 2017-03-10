package jp.co.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jp.co.example.entity.Sample;

public interface SampleDao extends JpaRepository <Sample, Integer> {

    @Query("select s from Sample s where s.name like 'test%' ")
    public List<Sample> findName();
}
