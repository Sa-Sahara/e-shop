//package com.edu.eshop.config;
//
//import com.github.cloudyrock.mongock.ChangeLog;
//import io.mongock.api.annotations.ChangeUnit;
//import io.mongock.api.annotations.Execution;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@ChangeUnit(id="myMigrationChangeUnitId", order = "1")
//public class DBChangelog {
//
////    private final MongoTemplate mongoTemplate;
////    private final UserRepository UserRepository;
////
////    @Execution
////    public void migrationMethod() {
////        // it will run only once
////        mongoTemplate.save(new User("Max","max@gmail.com","12345678"),"user");
////        mongoTemplate.save(new User("Max","max@gmail.com","12345678"),"user"));
////        // there are multiple ways by which we can save data here, we can even use repositories here.
////        // we can even use a csv file and put data into the db when this migration runs.
////    }
////
////    @RollbackExecution
////    public void rollback() {
////        // for rollback
////        userRepository.deleteAll()
////    }
//}
