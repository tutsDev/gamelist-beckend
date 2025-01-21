package com.intensivojavaspring.GameListApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivojavaspring.GameListApp.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
} 
