package com.capgemini.SpringBoot.Controller;

import com.capgemini.SpringBoot.Model.Schip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component

public interface SchipRepository extends CrudRepository <Schip, Long> {
}
