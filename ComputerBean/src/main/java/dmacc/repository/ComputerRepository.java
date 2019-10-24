package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.computer.computers;

@Repository
public interface ComputerRepository extends JpaRepository<computers, Long> { }
