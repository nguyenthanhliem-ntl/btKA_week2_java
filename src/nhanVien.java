public class nhanVien {
   private int manhanvien;
   private String hoten;
   private int tuoi;
   private int soDienThoai;
   private String email;

   public nhanVien(int manhanvien,String hoten,int tuoi,int soDienThoai,String email) {
       this.manhanvien = manhanvien;
       this.hoten = hoten;
       this.tuoi = tuoi;
       this.soDienThoai = soDienThoai;
       this.email = email;
   }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public nhanVien(){
        System.out.println("Mã nhân viên: " +this.manhanvien);
        System.out.println("Họ tên: " +this.hoten);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Số điệ thoại: "+ this.soDienThoai);
        System.out.println("Email "+ email);
    }


}
