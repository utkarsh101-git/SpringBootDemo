package com.gitexample.springBootWithGit.controllers;

import com.gitexample.springBootWithGit.models.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {

    @GetMapping(value = "/doctor-info")
    public ApiResponse<List<String>> getAllDoctorInformation(){
        List<String> doctorsInfo = new ArrayList<>();
        doctorsInfo.add("Raghav Juyal");
        doctorsInfo.add("Sanju Baba");
        doctorsInfo.add("Ajay Devgan");

        ApiResponse<List<String>> apiResponse = new ApiResponse<>("OK", 200, "Recieved Request",doctorsInfo );
        return apiResponse;
    }

}
