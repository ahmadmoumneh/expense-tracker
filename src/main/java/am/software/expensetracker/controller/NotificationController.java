/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.controller;

import am.software.expensetracker.dto.Notification;
import am.software.expensetracker.service.NotificationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sara
 */
@ControllerAdvice
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/expensetracker")
public class NotificationController {
    
    @Autowired 
    private NotificationService notificationService;
    
    @GetMapping("/notifications")
    public List<Notification> getAllCategories() {
        return this.notificationService.getAllNotifications();
    }
    
    @PostMapping("/addnotification")
    @ResponseStatus(HttpStatus.CREATED)
    public Notification addNotification(@RequestBody Notification notification) {
        return this.notificationService.saveNotification(notification);
    }
    
    @PutMapping("/editnotification")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Notification editNotification(@RequestBody Notification notification) {
        return this.notificationService.saveNotification(notification);
    }
    
    @DeleteMapping("/deletenotification/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNotification(@PathVariable int id) {
        this.notificationService.deleteNotificationById(id);
    }
    
    @GetMapping("/notification/{id}")
    public Notification getNotification(@PathVariable int id) throws Exception {       
        return this.notificationService.getNotificationById(id);
    }
    
    
    
    
    
    
}
