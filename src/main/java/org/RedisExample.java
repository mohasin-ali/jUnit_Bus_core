package org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;

public class RedisExample
{
	public static void readRedis(String pre, int start, int end) throws Exception {
		Jedis jedis = new Jedis(new HostAndPort("127.0.0.1", 6379));
		System.out.println("Hello Redis Read");
		System.out.println(jedis.get((String)""));
	//	System.out.println(jedis.hmset((String)null, (Map)null));
		Random rn = new Random();
		//long result = jedis.incrBy("helloInc", Long.MAX_VALUE);
		//System.out.println("Result "+result);
		for(int i=start ; i<end; i++) {
			//System.out.println(jedis.get(pre+"-"+i));
			if(i%4==0)
			{
				//redisRest(2l);
				//RegexPerfTest.main(null);
			}
			if(i%5==0) {
				String rnLong = "helloInc_"+rn.nextLong();
				//System.out.println(rnLong);
				try {
				long result1 = jedis.incrBy("helloInc", Long.MAX_VALUE);// jedis.incrBy(rnLong, Long.MAX_VALUE+1);
				System.out.println("Result " + result1);
				}catch(Exception e) {
					//System.out.println(e.getMessage());
				}
				jedis.del(rnLong);
			}
		}
		jedis.close();
	}
	public static void redisRest(long x) {
		try
		{
			Thread.sleep(x);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void addKeys(String word) {
		Jedis jedis = new Jedis();
		for(int i=0 ; i<1000; i++) {
			jedis.set(word+"-"+i, "events/city/rome"+i);
		}
		jedis.close();
	}
	public static void main(String[] args) throws Exception
	{
		//addKeys("shop");//customer, vendor, shop
		readRedis("shop", 1,1000);
		//testSet();
	}
	
	private static void testSet() {
		Set<Long> mid =  new HashSet<Long>();
		mid.add(1l);
		mid.add(2l);
		System.out.println(mid);
		Long monArr[] = new Long[mid.size()];
		mid.toArray(monArr);
		System.out.println(monArr[0]+" and "+monArr[1]);
		Map<Long,Long> map = new HashMap<Long, Long>();
		map.put(1l,100l);
		map.put(2l, 200l);
		map.put(3l, 200l);
		Set<Long> profileSet = new HashSet( map.values());
		System.out.println(profileSet);
	}
}
