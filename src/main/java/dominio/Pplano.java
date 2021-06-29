package dominio;

public class Pplano {

    private int dirX;
    private int dirY;

    public Pplano(int dirX, int dirY) {
        this.dirX = dirX;
        this.dirY = dirY;
    }

    public int getDirX() {
        return dirX;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public int getDirY() {
        return dirY;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    @Override
    public String toString() {
        return "X = " + this.dirX + "   " + "Y = " + this.dirY;
    }

}