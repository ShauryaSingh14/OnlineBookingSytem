package com.example.ibteam7.repository;

import com.example.ibteam7.entity.BillingInfoEntity;
import com.example.ibteam7.entity.GuestDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestDataRepository extends JpaRepository<GuestDataEntity, String> {
}
