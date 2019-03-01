package com.example.codeclanbank.spots.repositories;

import com.example.codeclanbank.spots.models.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository  extends JpaRepository<Merchant, Long> {
}
