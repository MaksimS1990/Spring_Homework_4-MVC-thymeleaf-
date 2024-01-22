package com.example.Sem4_Ex04.services;

import com.example.Sem4_Ex04.models.Auto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoService {

    List<Auto> automobiles = new ArrayList<>();

    /*
    метод добавления продуктв
     */
    public void addAuto(Auto automobile) {
        automobiles.add(automobile);
    }


    /*
    метод получения всех продуктов
     */
    public List<Auto> getAllAutomobiles() {
        return automobiles;
    }

}
