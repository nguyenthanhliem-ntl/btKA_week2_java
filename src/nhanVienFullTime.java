public class nhanVienFullTime extends nhanVien implements Thuong {
    private int tienThuong;
    private int tienPhat;
    private int luongCung;

    public nhanVienFullTime(int manhanvien, String hoten, int tuoi, int soDienThoai, String email, int tienThuong, int tienPhat, int luongCung) {
        super(manhanvien, hoten, tuoi, soDienThoai, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getluongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }
   public int luong() {
       return (getluongCung() + (getTienThuong() - getTienPhat()));
   }
    public String showNhanVien() {
        return  (getManhanvien()+" "+ getHoten()+" "+getSoDienThoai()+" "+getTuoi()+" " +getEmail());
    }

    @Override
    public String toString() {
        return this.getHoten();
    }
    @Override
    public void themThuong() {
        System.out.println("Thuong " + this.getHoten());
    }

    @Override
    public int getSalaryOfnhanVien() {
        return luongCung+tienThuong+tienPhat;
    }
}
