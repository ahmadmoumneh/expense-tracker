/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ahmad
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String username;
    
    @Column(nullable = false, unique = true, columnDefinition = "varchar(50)")
    private String email;
    
    @Column(nullable = false, columnDefinition = "varchar(12)")
    private String password;
    
    @Column(nullable = false, columnDefinition = "varchar(20)")
    private String firstName;
    
    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String LastName;
    
    @Column(columnDefinition = "longblob")
    private String avatar;
}
