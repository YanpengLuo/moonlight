package org.openboxprotocol.protocol.topology;

import org.junit.Test;
import org.moonlightcontroller.topology.TopologyManager;

public class TestTopologyManager {
	@Test
	public void testTopology() {
		TopologyManager manager = TopologyManager.getInstance();
		manager.getAllEndpoints();
	}
	
//	@Test
//	public void testTopology1() {
//		new TopologyManager("C:\\dev\\topology.json");
//	}
}
