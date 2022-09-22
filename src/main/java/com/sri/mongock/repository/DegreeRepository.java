package com.sri.mongock.repository;

import com.sri.mongock.model.Degree;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DegreeRepository extends ElasticsearchRepository<Degree, String> {


    List<Degree> findByName(String name);
}
