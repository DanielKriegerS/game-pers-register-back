package com.danielks.game_pers_register.repositories;

import com.danielks.game_pers_register.entities.Equipments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquipmentsRepository extends JpaRepository<Equipments, UUID> {
}
