package jp.co.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jp.co.example.entity.Sample;

public interface Sample2Dao extends JpaRepository <Sample, Integer> {

    @Query("select s from Sample s where s.id = 1 ")
    public List<Sample> findById1();
    
    @Query("from Sample where id = 1")
    public List<Sample> findById2();
    
    @Query(value="select * from sample where id = 1 ", nativeQuery = true)
    public List<Sample> findById3();
    
    @Query("select s from Sample s where s.id = ?1 ")
    public List<Sample> findById4(Integer id);
    
    @Query("select s from Sample s where s.id = :ID ")
    public List<Sample> findById5(@Param("ID")Integer id);
    
    @Query("select s from Sample s where s.name like ?1%")
    public List<Sample> findByLikeName(String name);
}
