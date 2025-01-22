package com.intensivojavaspring.GameListApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivojavaspring.GameListApp.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
} 
