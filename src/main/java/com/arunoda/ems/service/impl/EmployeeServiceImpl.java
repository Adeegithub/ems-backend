package com.arunoda.ems.service.impl;

import com.arunoda.ems.dto.EmployeeDTO;
import com.arunoda.ems.entity.Employee;
import com.arunoda.ems.mapper.EmployeeMapper;
import com.arunoda.ems.repository.EmployeeRepository;
import com.arunoda.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee =  employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }
}