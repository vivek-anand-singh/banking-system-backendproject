package com.sst.bankingsystem.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RoleId;
    private String RoleName;
    @OneToMany
    private List<Employee> users;

    public Role(Role role) {
        this.RoleName = role.getRoleName();
        this.users = role.getUsers();
        this.RoleId = role.getRoleId();
    }
}
