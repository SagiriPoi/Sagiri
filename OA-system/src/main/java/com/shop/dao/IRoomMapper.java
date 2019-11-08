package com.shop.dao;

import com.shop.domain.Room;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_room
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_room
     *
     * @mbg.generated
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_room
     *
     * @mbg.generated
     */
    Room selectByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_room
     *
     * @mbg.generated
     */
    List<Room> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_room
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Room room);

	List<Room> getRoomListByLimit(@Param("pageIndex")Integer pageIndex, @Param("pageSize")Integer pageSize);

	int updateSatusById(String roomId);

}