package com.abanul.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.io.Serializable;

@DynamoDBTable(tableName = "AwsService")
public class AwsService implements Serializable {
    private String id;
    private String description;
    private String data;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBAttribute
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
