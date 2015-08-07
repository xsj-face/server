package com.xsjmm.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chengbin on 15/8/7.
 */
@RestController
public class ProfileController {

    @RequestMapping(value = "profile/random", method = RequestMethod.GET)
    public @ResponseBody Profile random() {
        return new Profile(1);
    }

}
