package Service;

import Entity.EmployeeEntity;
import Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    public List<EmployeeEntity> getAllEmployee()
    {
        return repo.findAll();
    }

    public void saveEmployee(EmployeeEntity emp)
    {
        repo.save(emp);
    }

    public Optional<EmployeeEntity> getEmpById(int id)
    {
        return repo.findById(id);
    }
}
