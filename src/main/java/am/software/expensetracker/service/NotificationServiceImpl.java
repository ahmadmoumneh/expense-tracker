/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dao.NotificationRepository;
import am.software.expensetracker.dto.Notification;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sara
 */
public class NotificationServiceImpl implements NotificationService {
    @Autowired 
    NotificationRepository notificationDao;
    
    @Override
    public List<Notification> getAllNotifications() {
       return notificationDao.findAll();
    }

    @Override
    public Notification getNotificationById(int id) throws Exception {
        return notificationDao.findById(id).get();
    }

    @Override
    public Notification saveNotification(Notification notification) {
        return notificationDao.save(notification);
    }

    @Override
    public void deleteNotificationById(int id) {
        notificationDao.deleteById(id);
    }
}
