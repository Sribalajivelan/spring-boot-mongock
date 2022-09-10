/*
 * (c) CareerLabs. All rights reserved.
 */

package com.sri.mongock.migration;

import com.sri.mongock.model.Course;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeUnit(id = "demo2", order = "2", systemVersion = "1", runAlways = true)
@ConditionalOnProperty(value = "migration.demo1", havingValue = "true")
public class LoadMigrationTwo {

    private final MongoTemplate mongoTemplate;

    @Value("${migration.demo1}")
    private String name;

    public LoadMigrationTwo(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void migrationMethod() {
        System.out.println("name2 ===" + name);
        Course answerKey = new Course();
        answerKey.setName("1");
        mongoTemplate.save(answerKey);
        System.out.println(mongoTemplate.findAll(Course.class));
    }

    @RollbackExecution
    public void rollback() {

    }
}