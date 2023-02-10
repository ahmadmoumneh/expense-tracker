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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
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
public class Expense {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String title;
    
    @Column(nullable = false, columnDefinition = "varchar(300)")
    private String description;
    
    @Column(nullable = false, columnDefinition = "varchar(15)")
    private String expenseType;
    
    @Column(nullable = false, columnDefinition = "varchar(10)")
    private String pattern;
    
    @Column(nullable = false, columnDefinition = "varchar(10)")
    private String frequency;
    
    @Column(nullable = false, columnDefinition = "varchar(10)")
    private String priority;
    
    @Column(nullable = false, columnDefinition = "decimal(10,2)")
    private BigDecimal budget;
    
    @Column(columnDefinition = "date")
    private BigDecimal paymentDeadline;
    
    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean payed;
    
    @ManyToOne
    @JoinColumn(
            name = "category_id",
            referencedColumnName = "id"
    )
    Category category;
    
    @ManyToOne
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id"
    )
    User user;
}
