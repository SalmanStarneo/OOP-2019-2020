package ie.tudublin;

import processing.data.TableRow;

public class Color
{
    public int r;
    public int g;
    public int b;
    public int num;
    private String colour;

    public Color(int r, int g, int b, int num,String colour)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.num = num;
        this.colour=colour;
    }

    public Color(TableRow tr)
    {
        this(tr.getInt("r"), tr.getInt("g"), tr.getInt("b"), tr.getInt("value"),tr.getString("colour"));
    }


    @Override
    public String toString() {
        return "Color [num=" + num + ", colour=" + colour + ", r=" + r + ", g=" + g + ", b=" + b + "]";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}