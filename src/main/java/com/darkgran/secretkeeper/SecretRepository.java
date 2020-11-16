package com.darkgran.secretkeeper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretRepository extends JpaRepository<Secret, Integer> {
}
