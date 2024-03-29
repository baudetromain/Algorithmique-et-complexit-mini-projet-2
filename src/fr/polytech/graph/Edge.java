package fr.polytech.graph;

import java.util.Objects;

/*
A class to represent an edge.
An edge is holding a reference to both the nodes it connects, one being the starting node and one being the ending one, since the graph is oriented.
Also has a color inherited from the Colored class.
 */
public class Edge extends Colored
{
    private final Node begin;
    private final Node end;

    /*
    Creates an edge from its color and its two nodes.
     */
    public Edge(Color color, Node begin, Node end)
    {
        super(color);
        this.begin = begin;
        this.end = end;
    }

    /*
    Returns the ending node.
     */
    public Node getEnd()
    {
        return end;
    }

    /*
    Returns the starting node.
     */
    public Node getBegin()
    {
        return begin;
    }

    /*
    Conventional equals function.
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return end.equals(edge.end);
    }

    /*
    Autogenerated hashCode function.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(end);
    }

    /*
    Autogenerated toString function.
     */
    @Override
    public String toString()
    {
        return "Edge{" +
                "color=" + color +
                ", end=" + end +
                '}';
    }
}
