package com.perscholas.naildujour.data;

import com.perscholas.naildujour.models.Polish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface PolishRepository extends JpaRepository<Polish, Integer> {

    Polish findPolishByPolishName(String polishName);

    List<Polish> findAll();

    List<Polish> findPolishByPolishId(int id);

    void deletePolishByPolishName(String polishName);
}
