package com.sri.mongock.service;

import com.sri.mongock.exception.CustomException;
import com.sri.mongock.model.Degree;
import com.sri.mongock.repository.DegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DegreeServices {

    @Autowired
    private DegreeRepository degreeRepository;

    public List<Degree> degreeList() {
        return StreamSupport.stream(degreeRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Degree createDegree(Degree degree) {
        if (!degreeRepository.findByName(degree.getName()).isEmpty())
            throw new CustomException("Degree already exists", HttpStatus.BAD_REQUEST);
        degreeRepository.save(degree);
        return degree;
    }
}
