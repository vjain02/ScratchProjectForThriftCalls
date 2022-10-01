package org.example;

import com.capillary.commons.thrift.external.RPCService;
import com.capillary.shopbook.pointsengine.api.external.CustomerFilter;
import com.capillary.shopbook.pointsengine.api.external.PointsEngineService;
import com.capillary.shopbook.pointsengine.api.external.PointsEngineServiceException;
import org.apache.thrift.TException;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, PointsEngineServiceException, TException {
		System.out.println("Hello world!");
		 PointsEngineService.Iface rpcClient;
		 rpcClient = RPCService.rpcClient(PointsEngineService.Iface.class, "127.0.0.1", 9199, 5000);
//		280586253= not exist customer
		CustomerFilter filter = new CustomerFilter(1, 192);
		filter.setTillId(24);
		rpcClient.getAllTierDowngradeRetentionCriteria(filter,"req1");
	}
}