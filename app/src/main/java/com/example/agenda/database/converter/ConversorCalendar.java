package com.example.agenda.database.converter;

import androidx.room.TypeConverter;

import java.util.Calendar;

public class ConversorCalendar {

    @TypeConverter
    public Long paralong(Calendar valor){
        if (valor != null){
        return valor.getTimeInMillis();
        }
        return null;
    }

    @TypeConverter
    public Calendar paraCalendar(Long valor){
        Calendar momentoAtual = Calendar.getInstance();
        if (valor != null){
            momentoAtual.setTimeInMillis(valor);
        }
        return momentoAtual;
    }
}
