package com.restapi.dynamiccontent.rest_api_dynamic_content;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {
    @RequestMapping(method = RequestMethod.GET,path = "/GetVideos/{videoTopic}")
    public String GetVideos(@PathVariable String videoTopic){
        return String.format(  "Video: %v",videoTopic);
    }
}
