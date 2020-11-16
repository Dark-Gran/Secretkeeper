package com.darkgran.secretkeeper;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    SecretRepository secretRepository;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Map<String, Object> model) {

        Secret secret = secretRepository.findAll().get(0);
        model.put("secret", secret.getSecret());

        return "index";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String submit(Map<String, Object> model, @RequestParam String newSecretContent) {

        Secret secret = secretRepository.findAll().get(0);
        if (validSecretContent(newSecretContent)) {

            secret.setSecret(newSecretContent);
            secret.setTimestamp(new Timestamp(new Date().getTime()));
            secretRepository.save(secret);
            model.put("result", "Secret accepted.");

        } else {
            model.put("result", "Invalid secret!");
        }
        return "result";
    }

    private boolean validSecretContent(String secret) {
        return (secret != null && !secret.equals(""));
    }

}
