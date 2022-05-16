package com.example.config;



import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





@Configuration
public class DynamoDbConfiguration {


    AwsClientBuilder.EndpointConfiguration endpointConfig =
            new AwsClientBuilder.EndpointConfiguration("http://localhost:8000",
                    "us-east-1");
    @Bean
    public DynamoDBMapper mapper(){
        return new DynamoDBMapper(dynamodb);
    }
    public AmazonDynamoDB dynamodb = AmazonDynamoDBClientBuilder.standard()
            .withEndpointConfiguration(endpointConfig)
            .build();



}

