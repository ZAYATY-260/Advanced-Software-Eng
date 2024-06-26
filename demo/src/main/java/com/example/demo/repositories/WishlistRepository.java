package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Student;
import com.example.demo.models.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
  
Wishlist findByStudent(Student student);
  
}
