package by.iti.mobile.services;

import by.iti.mobile.exceptions.ServiceException;
import by.iti.mobile.pojo.Service;
import by.iti.mobile.pojo.Tariff;
import by.iti.mobile.pojo.UserTariff;

import java.util.List;

/**
 * Created by j on 22.5.17.
 */
public interface MobileService {
    List<Service> getAllServices() throws ServiceException;

    Service getServiceById(Long id) throws ServiceException;

    List<Tariff> getAllTariffs() throws ServiceException;

    Tariff getTariffById(Long id) throws ServiceException;

    UserTariff getUserTariffById(Long id) throws ServiceException;


}
