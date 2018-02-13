package com.maryanto.dimas.scheduler.example;

import org.springframework.stereotype.Service;

/**
 * Created by dimmaryanto93 on 21/02/17.
 */
@Service
public class PajakService {

    private Integer hasil = 1;

    public String counter() {
        hasil++;
        return String.format("hit %s times", hasil);
    }

}
