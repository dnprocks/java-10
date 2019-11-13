package com.challenge.repository;

import com.challenge.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

    @Query(value = "select ch.* from challenge ch\n" +
            "join acceleration a on ch.id = a.challenge_id\n" +
            "join candidate c on a.id = c.acceleration_id\n" +
            "join users u on  u.id = c.user_id where a.id = :accelerationId and u.id = :userId", nativeQuery = true)
    List<Challenge> findByAccelerationIdAndUserId(@Param("accelerationId") Long accelerationId, @Param("userId") Long userId);

}
