package com.sri.mongock.controller;

import com.sri.mongock.model.Degree;
import com.sri.mongock.service.DegreeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/degrees")
public class DegreeController {

    @Autowired
    private DegreeServices degreeServices;

    @GetMapping
    private List<Degree> getDegrees() {
        return degreeServices.degreeList();
    }

    @PostMapping
    private Degree createDegree(@Valid @RequestBody Degree degree) {
        return degreeServices.createDegree(degree);
    }
}
