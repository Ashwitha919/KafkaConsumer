package com.kafka.consumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @JsonProperty("user_name")
    private String name;

    @JsonProperty("user_dept")
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
