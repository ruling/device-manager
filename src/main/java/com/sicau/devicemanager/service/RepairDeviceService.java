package com.sicau.devicemanager.service;

import com.github.pagehelper.PageInfo;
import com.sicau.devicemanager.POJO.DO.RepairOrder;
import com.sicau.devicemanager.POJO.DTO.DeviceDTO;
import com.sicau.devicemanager.POJO.DTO.DeviceStatusRecordDTO;
import com.sicau.devicemanager.POJO.DTO.RepairOrderDTO;
import com.sicau.devicemanager.constants.DeviceStatusEnum;
import com.sicau.devicemanager.constants.OrderStatusEnum;

import java.util.List;

/**
 * 维修设备
 * @author
 */
public interface RepairDeviceService {


    /**
     * 提交报修设备订单
     * @param repairOrder
     */
    void submitRepairDeviceOrder(RepairOrder repairOrder);

    /**
     * 修改维修订单
     * @author Xiao W
     * @param repairOrder 包含id的order
     */
    void modifyOrder(RepairOrder repairOrder);

    /**
     * 根据设备id查询维修订单
     * @author Xiao W
     */
    List<RepairOrder> getOrdersByDeviceId(String deviceId);

    /**
     * 完结订单，设备维修后【管理员(维修人员)】调用
     * @author Xiao W
     * @param orderStatusEnum 维修完成后:已维修或维修失败
     */
    void finishOrder(int orderId, OrderStatusEnum orderStatusEnum);

    /**
     * 完结订单，订单完结后【用户】调用
     * @author Xiao W
     * @param deviceStatusEnum 维修完成后:已维修或维修失败
     */
    void finishOrder(int orderId, DeviceStatusEnum deviceStatusEnum);
}
