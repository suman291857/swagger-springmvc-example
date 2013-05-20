package com.mangofactory.swagger.springmvc.example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper=false)
public class PetResource extends ResourceSupport {
    private String name;
    private int age;
}
