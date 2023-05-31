package hibernate.assignment.one.services.impl;

import hibernate.assignment.one.entity.Director;
import hibernate.assignment.one.repository.DirectorRepo;
import hibernate.assignment.one.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    DirectorRepo directorRepo;

    @Override
    public List<Director> directorList() {
        return directorRepo.findAll();
    }
}
