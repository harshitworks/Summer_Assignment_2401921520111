package Week_4.OOPS;

public class box3d extends box{

    int z ;

    public box3d(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    public int area(int x , int y, int z) {
        return 2*(x*y + y*z + z*x);
    }
    public int volume(int x , int y, int z) {
        return x*y*z;
    }
}
