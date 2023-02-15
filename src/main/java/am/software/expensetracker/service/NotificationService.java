/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dto.Notification;
import java.util.List;

/**
 *
 * @author sara
 */
public interface NotificationService {
    
    List<Notification> getAllNotifications();

    Notification getNotificationById(int id) throws Exception;

    Notification saveNotification(Notification notification);

    void deleteNotificationById(int id);
    
}
