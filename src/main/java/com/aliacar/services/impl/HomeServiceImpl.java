package com.aliacar.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliacar.dto.DtoHome;
import com.aliacar.dto.DtoRoom;
import com.aliacar.entites.Home;
import com.aliacar.entites.Room;
import com.aliacar.repository.HomeRepository;
import com.aliacar.services.IHomeService;


@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;
    private Optional<Home> optional;

    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtoHome = new DtoHome();
      optional = homeRepository.findById(id);
      if(optional.isEmpty()){
        return null;
      }
      Home dbHome =optional.get();
      List<Room> dbRooms = optional.get().getRoom();

      BeanUtils.copyProperties(dbHome, dtoHome);
     if(dbRooms!=null && !dbRooms.isEmpty()){
        for(Room room:dbRooms){
            DtoRoom dtoRoom=new DtoRoom();
            BeanUtils.copyProperties(room, dtoRoom);
            dtoHome.getRooms().add(dtoRoom);
      
        }
        }

        return dtoHome;
    }

    
    
}
