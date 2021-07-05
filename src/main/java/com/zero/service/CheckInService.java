package com.zero.service;

import com.zero.pojo.CheckIn;
import com.zero.pojo.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckInService {
    /**
     * 通过编号查询客房
     * @param roomId 客房编号
     * @return 返回查询到的客房列表
     */
    List<Room> selectRoomById(@Param("roomId")Integer roomId);

    /**
     *通过类型查询客房
     * @param roomType 客房类型名
     * @return 返回查询到的客房列表
     */
    List<Room> selectRoomByType(@Param("roomType") String roomType);

    /**
     *通过状态查询客房
     * @param roomStatus 客房状态
     * @return 返回查询到的客房列表
     */
    List<Room> selectRoomByStatus(@Param("roomStatus")String roomStatus);

    /**
     *通过楼层查询客房
     * @param floor 楼层名
     * @return 返回查询到的客房列表
     */
    List<Room> selectRoomByFloor(@Param("floor") String floor);

    /**
     *通过价格查询客房
     * @param roomPrice 客房价格
     * @return 返回查询到的客房列表
     */
    List<Room> selectRoomByPrice(@Param("roomPrice")double roomPrice);

    /**
     * 填写入住信息
     * @param checkIn 入住对象
     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
     */
    int insertCheckIn(CheckIn checkIn);

//    /**
//     * 打印入住单
//     * @param checkIn 入住对象
//     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
//     */
//    int printCheckIn(CheckIn checkIn);

//    /**
//     * 保存登记信息
//     * @param checkIn 入住对象
//     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
//     */
//    int saveCheckIn(CheckIn checkIn);

    /**
     *根据入住单号查询入住客房信息
     * @param checkInId 入住单号
     * @return 返回查询到的客房信息列表
     */
    List<CheckIn> selectCheckInById(@Param("checkInId")Integer checkInId);

    /**
     *根据客房类型查询入住客房信息
     * @param roomType 客房类型
     * @return 返回查询到的客房信息列表
     */
    List<CheckIn> selectCheckInByRoomType(@Param("roomType") String roomType);

    /**
     *根据客房编号查询入住客房信息
     * @param roomId 客房编号
     * @return 返回查询到的客房信息列表
     */
    List<CheckIn> selectCheckInByRoomId(@Param("roomId")Integer roomId);

    /**
     *根据入住人查询入住客房信息
     * @param guest 入住人名字
     * @return 返回查询到的客房信息列表
     */
    List<CheckIn> selectCheckInByUser(@Param("guest") String guest);

//    /**
//     * 预定转入住
//     * @param id 预定id
//     * @return 入住后的CheckIn列表
//     * */
//    List<CheckIn> reserveToCheckIn(@Param("id") Integer id);

    /**
     *根据RoomRegister的id查询入住客房信息
     * @param id RoomRegister的id
     * @return 返回查询到的客房信息列表
     */
    List<CheckIn> selectCheckInByRoomRegister(@Param("id")Integer id);

    /**
     * 换房
     * @param checkInId 需要更改的CheckInId
     * @param roomId 更改后的roomId
     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
     */
    int changeRoom(@Param("checkInId") Integer checkInId,@Param("roomId") Integer roomId);
}
