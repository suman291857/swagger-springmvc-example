package com.mangofactory.swagger.springmvc.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NewPet implements Serializable {
    private String id;
    private String name;
    private int age;
    private List<NewPet> newPets;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<NewPet> getNewPets() {
        return newPets;
    }

    public void setNewPets(List<NewPet> newPets) {
        this.newPets = newPets;
    }

}
