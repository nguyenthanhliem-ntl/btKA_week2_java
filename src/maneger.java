import java.util.Scanner;

public class maneger {
    private nhanVien[] nhanViens;

    public nhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(nhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }
    public void getAllnhanVien() {
        for( nhanVien e : nhanViens) {
            System.out.println(e.toString());
        }
    }
    public nhanVienFullTime[] getAlltTime() {
        nhanVienFullTime[] fullTimes = new nhanVienFullTime[nhanViens.length];
        int count = 0;
        for (nhanVien e : nhanViens){
            if( e instanceof nhanVienFullTime){
                fullTimes[count]= (nhanVienFullTime) e;
                count++;
            }
        }return fullTimes;
    }
    public double getTB() {
        int sum = 0;
        int count = 0;
        for(nhanVien e : nhanViens) {
            if(e!=null ) {
                sum += e.getSalaryOfnhanVien();
                count++;
            }
        }
        return sum/count;
    }
    public nhanVienFullTime[] getFullTimeTB(){
        nhanVienFullTime[] fullTimes = this.getAlltTime();
        double tb = this.getTB();
        nhanVienFullTime []fullTime = new nhanVienFullTime[fullTimes.length];
        int count = 0;
        for (nhanVienFullTime e : fullTimes) {
            if(e !=null) {
                if(e.getSalaryOfnhanVien()<tb) {
                    fullTime[count] =e ;
                    count++;
                }
            }

        } return fullTime;
    }
    public void getSumThuong() {
        for(nhanVien e : nhanViens){
            if(e instanceof Thuong)
                ((Thuong) e).themThuong();
        }
    }
}
