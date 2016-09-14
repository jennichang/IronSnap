package com.theironyard.charlotte.entities;

import com.theironyard.charlotte.services.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.TimerTask;



class Timer extends TimerTask {

    @Autowired
    PhotoRepository photos;

   @Override
    public void run() {
//       photos.delete();
    }

}