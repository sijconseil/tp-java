package lettertree;

import java.util.HashMap;
import java.util.Map;

public class Node {
	
	public boolean terminal=false;
	public Map<Character, Node> children = new HashMap<>();
	
}
