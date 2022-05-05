package com.foodieRoad.repository;

import com.foodieRoad.domain.StoreSource;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/05
 */
public interface StoreSourceRepository extends MongoRepository<StoreSource,Long> {
}
