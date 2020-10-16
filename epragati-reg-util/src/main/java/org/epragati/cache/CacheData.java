package org.epragati.cache;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CacheData {

	private static ConcurrentHashMap<String, Object> masterCacheData = new ConcurrentHashMap<>();

	public static Object getFromCache(String key) {
		return masterCacheData.get(key);
	}

	public static void storeIntoCache(String key, Object tobeCacheData) {
		masterCacheData.put(key, tobeCacheData);
	}

	public  static ConcurrentHashMap<String, Object> getcacheMap() {
		return CacheData.masterCacheData;

	}
	
	public static String getPaymentTxidNo() {
		return UUID.randomUUID().toString();
	}
}
