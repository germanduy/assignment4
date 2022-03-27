package assignment4;

import secction4lap1.PhoneNumber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc{
    public ArrayList<LopHoc> danhSachLopHoc = new ArrayList<>();

    public void themLopHoc(String name,int soluonghocsinh){
        for(LopHoc p:danhSachLopHoc){
            if(p.name==name){
                System.out.println("Đã có lớp học này");
                return;
            }
        }
        LopHoc pn = new LopHoc();
        pn.name=name;
        pn.soluonghocsinh=soluonghocsinh;
        danhSachLopHoc.add(pn);
    }
    public void xoaLopHoc(String name){
        for(LopHoc p:danhSachLopHoc){
            if(p.name==name){
                danhSachLopHoc.remove(p);
                return;
            }
        }

    }
    public void sapxep(){
        String n1;
        int s1;
        for( int i=0 ; i < danhSachLopHoc.size() -1; i++){
            for( int j =1+i ; j< danhSachLopHoc.size(); j++){
                if(danhSachLopHoc.get(j).soluonghocsinh > danhSachLopHoc.get(i).soluonghocsinh){
                    n1 = danhSachLopHoc.get(j).name;
                    s1 = danhSachLopHoc.get(j).soluonghocsinh;
                    danhSachLopHoc.get(j).name= danhSachLopHoc.get(i).name;
                    danhSachLopHoc.get(j).soluonghocsinh = danhSachLopHoc.get(i).soluonghocsinh;
                    danhSachLopHoc.get(i).name= n1;
                    danhSachLopHoc.get(i).soluonghocsinh=s1;

                }
            }
        }
        for(LopHoc p:danhSachLopHoc){
            System.out.println(p.name);
            System.out.println(p.soluonghocsinh);
        }

    }
    public void inDanhSach(){
        for( LopHoc p:this.danhSachLopHoc){
            System.out.println(p.name);
            System.out.println(p.soluonghocsinh);
        }

    }


}
