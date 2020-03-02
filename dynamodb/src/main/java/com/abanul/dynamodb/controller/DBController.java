package com.abanul.dynamodb.controller;

import com.abanul.dynamodb.model.AwsService;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

    @Autowired
    DynamoDBMapper dynamoDBMapper;

    @PostMapping
    public void getRecords(){
        AwsService awsService = new AwsService();
        awsService.setData("Andrii custome data");
        awsService.setDescription("Andrii Description");

        dynamoDBMapper.save(awsService);
    }

}
