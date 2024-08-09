package com.danielks.game_pers_register.repositories;

import com.danielks.game_pers_register.entities.PersType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersTypeRepository extends JpaRepository<PersType, UUID> {
}
