package Unit_2;

import java.util.*;

import static java.lang.Math.*;

public class Airplane {
    private String cs;
    private double dist;
    private int dir;
    private int alt;

    public Airplane() {
        this("AAA01", 1, 0, 0);
    }

    public Airplane(String cs, double dist, int dir, int alt) {
        this.cs = cs;
        this.dist = dist;
        this.dir = dir;
        this.alt = alt;
    }

    public void move(double dist, int dir) {
        this.dist += dist;
        this.dir = dir;
    }

    public void gainAlt() {
        this.alt += 1000;
    }

    public void loseAlt() {
        if (this.alt - 1000 < 0)
            this.alt = 0;
        else
            this.alt -= 1000;
    }

    public int getAlt() {
        return alt;
    }

    public String toString() {
        return String.format("%s - %.1f miles away at bearing %03d°, altitude %d feet",
                this.cs, this.dist, this.dir, this.alt);
    }

    public double distTo(Airplane other) {
        return 0.0;
    }
}
