package com.ketha.FoE_RR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ketha.FoE_RR.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

}
