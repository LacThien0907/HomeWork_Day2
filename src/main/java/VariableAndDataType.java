

public class VariableAndDataType {
    public static void main(String[] args){
        System.out.println("ĐÂY LÀ BÀI TẬP CỦA HỮU TRỌNG");
        System.out.println("Bài 4:");
        int BirthYear = 1997;
        int NowYear =  2021;
        int Age = (NowYear - BirthYear);
        System.out.println("Năm sinh: " + BirthYear);
        System.out.println("Năm hiện tại: " + NowYear);
        System.out.println("Hiện tại tôi: " + Age + " tuổi");
        System.out.println("----");

        System.out.println("Bài 5:");
        int A = 10;
        int B = 5;
        System.out.println("Với A bằng = " + A);
        System.out.println("Với B bằng = " + B);
        System.out.println("Tổng A và B là: " + (A+B));
        System.out.println("Hiệu A và B là: " + (A-B));
        System.out.println("Tích A và B là: " + (A*B));
        System.out.println("Thương A và B là: " + (A/B)); // double div = (double)A/B; quy ước kiểu dữ liệu ra
        System.out.println("----");

        System.out.println("Bài 6:");
        System.out.println("Sản phẩm bán: Sữa");
        int Amount = 20;
        int Price = 30000;
        int Total = Amount*Price;
        int GTGT = (Total*10)/100;
        System.out.println("Tiền: " + Total + ("VND"));
        System.out.println("Thuế GTGT: " + GTGT + ("VND"));
        System.out.println("Tổng tiền phải trả: " + (Total+GTGT) + ("VND"));
        System.out.println("----");

        System.out.println("Bài 7:");
        int Mat = 10;
        Double Phy = 9.5;
        Double Che = 9.1;   //Gán hệ số final int X = 10;
        Double Average = (Mat+Phy+Che)/3;
        System.out.println("Toán: " + Mat );
        System.out.println("Lý: " + Phy );
        System.out.println("Hóa: " + Che );
        System.out.println("Điểm trung bình của học sinh: " + Math.round(Average*100.0)/100.0 );
        System.out.println("----");

        System.out.println("Bài 8:");
        int BK = 2;
        System.out.println("Bán kính đường tròn: " + BK + " Cm" );
        System.out.println("Chu vi đường tròn: " + BK*3.14 + " Cm" );
        System.out.println("Diện tích đường tròn: " + BK*3.14*3.14 + " Cm2" );
        System.out.println("----");

        System.out.println("Bài 9:");
        int B1 = 9;
        int B2 = 8;
        int B3 = 7;
        int B4 = 6;
        int B5 = 5;
        int Number = (B1+B2+B3+B4+B5)%10;
        System.out.println("Biển số xe của tôi: " + B5 + B4 + B3 + B2 + B1);
        System.out.println("Biển số xe của tôi được: " + Number);
        System.out.println("----");

        System.out.println("Bài 10:");
        int A1 = 15;
        int A2 = 19;
        System.out.println("Số thứ nhất: " + A1);
        System.out.println("Số thứ hai: " + A2);
        System.out.println("Min: " + Math.min(A1,A2));
        System.out.println("Max: " + Math.max(A1,A2));
        /*
        + Thêm tính năng
        - Chỉnh sửa quan trọng
        * Fix bug
!       Nghiêm trọng, quan trọng
        */











    }

}

