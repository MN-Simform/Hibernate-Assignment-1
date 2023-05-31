package hibernate.assignment.one.controller;

import hibernate.assignment.one.entity.Director;
import hibernate.assignment.one.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/directors")
public class DirectorController {

    @Autowired
    DirectorService directorService;

    @RequestMapping("/")
    public List<Director> directorList() {
        return directorService.directorList();
    }
}
