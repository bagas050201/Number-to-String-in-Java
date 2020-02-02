package AngkaStringToAngkaStringBuffer;
import java.util.Scanner;
import java.lang.StringBuffer;//digunakan untuk menghemat penggunaan memory saat mengerjakan banyak proses string(disarankan)
/*StringBuffer to String = obj.toString();
 * String to StringBuffer = obj.append();
 * The Original author of the Program Code below is M. Bagas Pradana (1313618015) from Ilkom UNJ 2018.
 * If there is a writing program that is a little confusing for you, please forgive me OK :D
 */

public class AngkaToTerbilang 
{
static  String[]huruf={" ","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};//membuat array string

        public static void main(String[] args) 
        
        {
          Scanner Input = new Scanner(System.in);//pemanggilan input (create a input)
          String Kembali = "Y";//membuat syarat agar while mau berputar (made a requirment for while to spin)
          int Iterasi = 0; //iteration
           
          	try //terjadi masalah disini sehingga saya menggunakan try sebagai fungsi untuk memperbaiki Input yang tidak diketahui asalnya (
          	{   // There is a problem here, so i use a "try" as a function to improve input that is not known to origin input
          		System.out.println("Nama = Muhammad Bagas Pradana \nProdi = Ilmu Komputer 2018 \nNIM = 1313618015\nMata Kuliah = DPBO\n<<<<<<<Tugas Membuat Program dari Angka ke Pembilangnya yang bersifat String menuju StringBuffer>>>>>>>\n<<<<<<<The task of creating a program from a number to its numerator that is String to StringBuffer>>>>>>>");
          		System.out.println();
          		while(Kembali.equalsIgnoreCase("Y")) //fungsi while yang berputar putar (while spinning function)
          		{
          			System.out.print("Masukan Bilangan(input number): ");
          			Long angka = Input.nextLong();
          			if (angka == 0)
          			{
          				StringBuffer obj = new StringBuffer();
          				System.out.println("Terbilang Dari Angka Tersebut Adalah = " + obj.append("Nol"));
          				Iterasi++;
          				System.out.println("Saat Ini Anda Telah Melakukan Iterasi ke - " +Iterasi);
          				System.out.println();
          				System.out.print("Do you want to go back to the start menu ? Y/T : ");//minta user untuk memilih mau mengulang atau tidak (ask the user to choose whether to repeat or not)
          				Kembali = Input.next();
          				
          			}
          			if (angka > 0)
          			{
          				System.out.println("Terbilang Dari Angka Tersebut Adalah = " +PengubahAngkaToTerbilang(angka));//memanggil hasil jawaban dari fungsi PengubahAngkaToTerbilang (call the answer to the Changing Number Time function)
          				Iterasi++;
          				System.out.println("Saat Ini Anda Telah Melakukan Iterasi ke - " +Iterasi);
          				System.out.println();
          				System.out.print("Do you want to go back to the start menu ? Y/T : ");//minta user untuk memilih mau mengulang atau tidak (ask the user to choose whether to repeat or not)
          				Kembali = Input.next();
                    }
          			if(angka < 0)
          			{
              			System.out.println("Terbilang Dari Angka Tersebut Adalah = " +PengubahNegatifAngkaToTerbilang(angka));//memanggil hasil jawaban dari fungsi PengubahNegatifAngkaToTerbilang (call the answer to the Changing Number Time function)
              			Iterasi++;
              			System.out.println("Saat Ini Anda Telah Melakukan Iterasi ke - " +Iterasi);
              			System.out.println();
                    	System.out.print("Do you want to go back to the start menu ? Y/T : ");//minta user untuk memilih mau mengulang atau tidak (ask the user to choose whether to repeat or not)
                        Kembali = Input.next();
          			}
          		}
          		
          	}
          	finally//saat try dipanggil maka finally akan selalu dipanggil apapun yang terjadi (when the try is called then finally it will always be called whatever happens )
          	{
          		Input.close();//tutup fungsi inputnya (close the input function)
          	}
          }
          
        public static StringBuffer PengubahNegatifAngkaToTerbilang(long angka)
    	{
    		
    		StringBuffer obj = new StringBuffer(1000);
    		if (angka < 0 && angka > -12)
        	{
        		angka = angka * -1;
        		obj.append("Negatif ");
        		obj.append(huruf[(int)angka]);
        	}
        	
        	if(angka <= -12 && angka >= -19) 
            {
            	angka = angka * -1;
            	obj.append("Negatif ");
        		obj.append(huruf[(int)angka% 10]);
            	obj.append(" Belas ");
            }
            
        	if(angka <= -20 && angka >= -99)
            {
            	angka = angka * -1;
            	obj.append("Negatif ");
            	angka = angka * 1;
            	obj.append(PengubahAngkaToTerbilang((int)angka / 10));
            	obj.append(" Puluh " );
            	obj.append(huruf[(int)angka % 10]);
            }
            
        	if(angka <= -100 && angka >= -199)
            {
            	angka = angka * -1;
            	obj.append("negatif ");
            	obj.append(" Seratus ");
            	obj.append(PengubahAngkaToTerbilang(angka % 100));
    		}	
            
        	if(angka <= -200 && angka >= -999)
            {
        		angka = angka * -1;
        		obj.append("Negatif ");
            	obj.append(PengubahAngkaToTerbilang(angka / 100));
            	obj.append(" Ratus ");
            	obj.append(PengubahAngkaToTerbilang(angka % 100));
            }
            
        	if(angka <= -1000 && angka >= -1999)
            {
        		angka = angka * -1;
        		obj.append("Negatif ");
            	obj.append(" Seribu ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000));
            }
            
        	if(angka <= -2000 && angka >= -999999)
            {
        		angka = angka * -1;
        		obj.append(" Negatif ");
            	obj.append(PengubahAngkaToTerbilang(angka / 1000));
            	obj.append(" Ribu ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000));
            }
            if(angka <= -1000000 && angka >= -999999999)
            {
            	angka = angka * -1;
            	obj.append(" Negatif ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000000000));
            	obj.append(" Juta ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000000));
            }
            
            if(angka <= -1000000000 && angka >= -999999999999L)
            {
            	angka = angka * -1;
            	obj.append(" Negatif ");
            	obj.append(PengubahAngkaToTerbilang(angka / 1000000000));
            	obj.append(" Milyar ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000000000));
            }
            if(angka <= -1000000000000L && angka >= -9999999999999L)
            {
            	angka = angka * -1;
            	obj.append(" Negatif ");
            	obj.append(PengubahAngkaToTerbilang(angka / 1000000000000L));
            	obj.append(" Trilliun ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000000000000L));
            }
            if(angka >= 1000000000000000L && angka <= 9999999999999999L)
            {
            	angka = angka *-1;
            	obj.append(" Negatif ");
            	obj.append(PengubahAngkaToTerbilang(angka / 1000000000000000L));
            	obj.append(" QuadTrilliun ");
            	obj.append(PengubahAngkaToTerbilang(angka % 1000000000000000L));
            }
            
            return obj;
            }
     
    /**
     *jika tulisan StringBuffernya kita hapus menjadi String saja maka output dari class ini harus melakukan return String dan diakhiri return ""; 
     *( if we delete StringBuffer into String then the output of this class must return a String and end the return "";)
     *
     *jika ingin outputnya string : 1. Ubah StringBuffer diatas menjadi string (Change the above StringBuffer to a string)
     *(if you want to output		 2. hapus tulisan objek StringBuffer dibawah (delete the StringBuffer object below)
     *the string)					 3. setiap selesai melakukan fungsi maka akhiri dengan return bukan append (after completing the function, end with return instead of append)
     *						 		 4. cnth = return huruf[angka].getInt(); (cnth = return huruf[angka] .getInt ();)
     *						 		 5. akhiri class tersebut dengan Return ""; (end the class with Return "";)
     *
     *output dari class ini adalah StringBuffer (the output of this class is StringBuffer)
     *batas angka yang dapat dikonversi adalah 1.000.000.000.000.000 karena sudah saya uji coba, jika ingin lebih besar maka gunakan BigInteger bukan Long
     */   
     public static StringBuffer PengubahAngkaToTerbilang(long angka) 
     
     {
    	 StringBuffer obj = new StringBuffer(1000);
   
    	if(angka < 12)
    	{
        	obj.append(huruf[(int)angka]);
    	}
        if(angka >=12 && angka <= 19) 
        {
        	obj.append(huruf[(int)angka% 10]);
        	obj.append(" Belas");
        }
        if(angka >= 20 && angka <= 99)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 10));
        	obj.append(" Puluh " );
        	obj.append(huruf[(int)angka % 10]);
        }
        if(angka >= 100 && angka <= 199)
        {
        	obj.append("Seratus ");
        	obj.append(PengubahAngkaToTerbilang(angka % 100));
		}	
        if(angka >= 200 && angka <= 999)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 100));
        	obj.append(" Ratus ");
        	obj.append(PengubahAngkaToTerbilang(angka % 100));
        }
        if(angka >= 1000 && angka <= 1999)
        {
        	obj.append("Seribu");
        	obj.append(PengubahAngkaToTerbilang(angka % 1000));
        }
        if(angka >= 2000 && angka <= 999999)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 1000));
        	obj.append(" Ribu ");
        	obj.append(PengubahAngkaToTerbilang(angka % 1000));
        }
        if(angka >= 1000000 && angka <= 999999999)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 1000000));
        	obj.append(" Juta ");
        	obj.append(PengubahAngkaToTerbilang(angka % 1000000));
        }
        if(angka >= 1000000000 && angka <= 999999999999L)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 1000000000));
        	obj.append(" Milyar ");
        	obj.append(PengubahAngkaToTerbilang(angka % 1000000000));
        }
        if(angka >= 1000000000000L && angka <= 9999999999999L)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 1000000000000L));
        	obj.append(" Trilliun ");
        	obj.append(PengubahAngkaToTerbilang(angka % 1000000000000L));
        }
        if(angka >= 1000000000000000L && angka <= 9999999999999999L)
        {
        	obj.append(PengubahAngkaToTerbilang(angka / 1000000000000000L));
        	obj.append(" QuadTrilliun ");
        	obj.append(PengubahAngkaToTerbilang(angka % 1000000000000000L));
        }
        
        
        return obj;
        }
     }
