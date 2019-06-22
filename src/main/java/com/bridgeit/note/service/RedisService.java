//package com.bridgeit.fundoo.note.service;
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RedisService<T> {
//
//	private HashOperations<String, Object, T> hashOperation;
//
//	@Autowired
//	public RedisService(RedisTemplate<String, T> redisTemplate) {
//		this.hashOperation = redisTemplate.opsForHash();
//		redisTemplate.expire("note", 1, TimeUnit.MINUTES);
//		;
//	}
//
//	public void putMap(String redisKey, Object key, T data) {
//		try {
//
//			hashOperation.put(redisKey, key, data);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//	public T getMapAsSingleEntry(String redisKey, Object key) {
//		return hashOperation.get(redisKey, key);
//	}
//
//	public Map<Object, T> getMapAsAll(String redisKey) {
//		return hashOperation.entries(redisKey);
//	}
//
//	public void deleteMap(String redisKey, Object key) {
//		hashOperation.delete(redisKey, key);
//	}
//}
