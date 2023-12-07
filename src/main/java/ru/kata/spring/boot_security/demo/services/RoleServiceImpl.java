package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;
import ru.kata.spring.boot_security.demo.repositories.UserRepository;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleRepository roleRepository;
    @Autowired
    public void setBeans(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Override
    public Role getById(int id) {
        return roleRepository.getById(id);
    }
}