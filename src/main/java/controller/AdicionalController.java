package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.AdicionalService;

@RestController
@RequestMapping("/adicional")
public class AdicionalController {

    @Autowired
    AdicionalService adicionalService;

}