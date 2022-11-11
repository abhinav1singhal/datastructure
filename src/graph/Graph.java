package graph;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<GraphNode, List<GraphNode>> adjVertices;
    

    public Map<GraphNode, List<GraphNode>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<GraphNode, List<GraphNode>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Graph(Map<GraphNode, List<GraphNode>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    void addAdjVerticesx(int label){
        this.getAdjVertices().putIfAbsent(new GraphNode(label), new ArrayList<>());
    }

    void removeAdjVErtices(int label){
        GraphNode graph=new GraphNode(label);
        this.getAdjVertices()
                .values()
                .stream()
                .forEach(e->e.remove(graph));
        this.getAdjVertices().remove(new GraphNode(label));        
    }
    
    
}
