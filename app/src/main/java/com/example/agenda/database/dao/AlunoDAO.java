package com.example.agenda.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.agenda.model.Aluno;

import java.util.List;

@Dao
public interface AlunoDAO {
    @Insert
    Long salva (Aluno aluno);

    @Query("SELECT * FROM Aluno ORDER BY nome")
    List<Aluno> todos();

    @Delete
    void remove(Aluno aluno);

    @Update
    void edita(Aluno aluno);
}
