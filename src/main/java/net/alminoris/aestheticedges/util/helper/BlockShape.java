package net.alminoris.aestheticedges.util.helper;

import java.util.List;

public class BlockShape
{
    double minX;
    double maxX;
    double minY;
    double maxY;
    double minZ;
    double maxZ;

    public BlockShape(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
    {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.minZ = minZ;
        this.maxZ = maxZ;
    }

    public List<Double> getShapeCoords()
    {
        return List.of(minX, minY, minZ, maxX, maxY, maxZ);
    }
}
