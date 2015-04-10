package jurnal2;

import java.util.Scanner;  
public class Jurnal2 {  
  
public static void main(String[] args) {  
Scanner input=new Scanner(System.in);
int a=0,b=0,j,i;
boolean isprima;
System.out.println("Masukkan angka pertama :");
a=input.nextInt();
System.out.println("Masukkan angka terakhir : ");
b=input.nextInt();
for(i=a;i<=b;i++){
isprima=true;
for(j=a;j<i;j++){
if(i%j==0){
isprima=false;
break;
}
}
if(isprima==true){
System.out.println("bilangan ke - " + i + " adalah  bilangan Prima");
}
}
}
}