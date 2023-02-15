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
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sara
 */


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String title;
    
    @Column(nullable = false, columnDefinition = "varchar(300)")
    private String description;
    
    @Column(columnDefinition = "date")
    private LocalDate reminder;
    
    @Column(nullable = false,columnDefinition="boolean")
    private boolean read;
    
    
    
    
    
    
}
