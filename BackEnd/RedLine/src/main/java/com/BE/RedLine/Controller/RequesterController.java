package com.BE.RedLine.Controller;

import com.BE.RedLine.DAO.RequestRepo;
import com.BE.RedLine.Model.Request;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
//@RequestMapping("")
public class RequesterController {
    final RequestRepo requestRepository;

    public RequesterController(RequestRepo requestRepository) {
        this.requestRepository = requestRepository;
    }

    //create one
//    @PutMapping("/")
//    public Request createNineLine(){
//
//    }



}
