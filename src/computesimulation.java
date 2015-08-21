import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class computesimulation {
	public static float landtime;
	static int gnda=0;
	//static int pass=0;
	static int gas=0;
	static int go=0;
	static int ab=0;
	static int gup=0;
	public static String gearpos;
	public static float speed;
	public static float altitude=0;
	public static String value1;
	public static String value2;
	public static String value3;
	public static String value4;
	public static String value5;
	static int pass;
	static int fail;
	static int pass1;
	static int fail1;

public static void X(int i) 
{
	
	File f= new File("D:\\UTA\\Courses\\Software Testing 5321\\project\\Iteration-2_Team-7\\projectrun\\finalfinal.xls");
	Workbook vb = null;
	try {
		vb = Workbook.getWorkbook(f);
	} catch (BiffException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Sheet s= vb.getSheet(0);
	//String b = "y";
	//@SuppressWarnings("resource")
	//Scanner sc = new Scanner(System.in);
	//while("y".equals(b))
	//{
	//for (int i=2;i<39;i++)
    //{*/
    		Cell c= s.getCell(3, i);
    		//System.out.println(c.getContents());
    		speed = Integer.valueOf(c.getContents()).intValue();
				//System.out.println("Speed : "+speed);
				c= s.getCell(4, i);
				gearpos = c.getContents();
				//System.out.println("Enter Gear Position. up or down : "+gearpos);
				c= s.getCell(5, i);
				altitude = Integer.valueOf(c.getContents()).intValue();
				//System.out.println("Enter Altitude : "+altitude);
				c= s.getCell(6, i);				
				landtime = Integer.valueOf(c.getContents()).intValue();
				c= s.getCell(7, i);				
				value1 = c.getContents();
				//System.out.println("Enter gnda : "+value1);
				c= s.getCell(8, i);				
				value2 = c.getContents();
				//System.out.println("Enter gas : "+value2);
				c= s.getCell(9, i);				
				value3 = c.getContents();
				//System.out.println("Enter ab : "+value3);
				c= s.getCell(10, i);				
				value4 = c.getContents();
				//System.out.println("Enter go : "+value4);
				c= s.getCell(11, i);				
				value5 = c.getContents();
				//System.out.println("Enter gup : "+value5);
				gnda=0;
				gas=0;
				ab=0;
				go=0;
				gup=0;
				calculate(speed,gearpos,altitude,landtime);
				}
//@SuppressWarnings("unused")
public static void calculate(float speed2,String b, float altitude2,float landtime2)
 {
	float speed = speed2;
	gearpos = b;
	float altitude = altitude2;
	float landtime=landtime2;
	System.out.println(speed+" "+gearpos+" "+altitude+" "+landtime);
	// TODO Auto-generated method stub
	if ("N".equals(gearpos) && (landtime <=120.0 || altitude <1000.0))
	{
		 gnda = 1;
		 //gas=0;
		 //ab=0;
		 //go=0;
		 //gup=0;
	}
	if("Y".equals(gearpos) && speed>400.0)
	{
		//gearoverridewarn = "on";0
		//System.out.println("Gear over ride warning ");
		//System.out.println("Gear UP Command ");
		//gnda=0;
		//gas=0;
		//ab=0;
		go=1;
		gup=1;
	}
	if(speed >= 250.0 && landtime < 60.0)
	{
		//airbrakewarn = "on";
		//System.out.println("AirBrake warning ");
		//gnda=0;
		//gas=0;
		ab=1;
		//go=0;
		//gup=0;
	}
	if("Y".equals(gearpos) && speed>300.0)
	{
		//gearairspeedalarm = "on";
		//System.out.println("Gear air speed Alarm ");
		//gnda=0;
		gas=1;
	//	ab=0;
		//go=0;
		//gup=0;
	}
	
	//return landtime;
	 
	if (("".equals(value1) && gnda == 0) && ("X".equals(value2) && gas == 1) && ("X".equals(value3) && ab == 1) && ("X".equals(value4) && go == 1) && ("X".equals(value5) && gup==1)||
			("X".equals(value1) && gnda == 1) && ("".equals(value2) && gas == 0) && ("X".equals(value3) && ab == 1) && ("".equals(value4) && go == 0) && ("".equals(value5) && gup==0)||
			("".equals(value1) && gnda == 0) && ("X".equals(value2) && gas == 1) && ("".equals(value3) && ab == 0) && ("X".equals(value4) && go == 1) && ("X".equals(value5) && gup==1)||
			("X".equals(value1) && gnda == 1) && ("".equals(value2) && gas == 0) && ("".equals(value3) && ab == 0) && ("".equals(value4) && go == 0) && ("".equals(value5) && gup==0)||
			("".equals(value1) && gnda == 0) && ("X".equals(value2) && gas == 1) && ("X".equals(value3) && ab == 1) && ("".equals(value4) && go == 0) && ("".equals(value5) && gup==0)||
			("".equals(value1) && gnda == 0) && ("X".equals(value2) && gas == 1) && ("".equals(value3) && ab == 0) && ("".equals(value4) && go == 0) && ("".equals(value5) && gup==0)||
			("".equals(value1) && gnda == 0) && ("".equals(value2) && gas == 0) && ("X".equals(value3) && ab == 1) && ("".equals(value4) && go == 0) && ("".equals(value5) && gup==0)||
			("".equals(value1) && gnda == 0) && ("".equals(value2) && gas == 0) && ("".equals(value3) && ab == 0) && ("".equals(value4) && go == 0) && ("".equals(value5) && gup==0))
		{
		pass=1;
		pass1 = pass1 + 1;
		}
	else
	{
		fail=1;
		fail1 = fail1 + 1;
	}	
		
	
//System.out.println("Next Input? y or n");

//System.out.println("Bye");
//sc.close();




	
}
public static float landtime()
{
    //float altitude;
	return landtime;
}

public static float altitude()
{
    //float altitude;
	return altitude;
}
public static float speed()
{
    //float altitude;
	return speed;
}
public static String gearpos()
{
    //float altitude;
	return gearpos;
}
public static int gnda()
{
    //float altitude;
	return gnda;
}
public static int gas()
{
    //float altitude;
	return gas;
}
public int go()
{
    //float altitude;
	return go;
}
public int ab()
{
    //float altitude;
	return ab;
}
public int gup()
{
    //float altitude;
	return gup;
}
public String value1()
{		
    //float altitude;
	return value1;
}
public String value2()
{
    //float altitude;
	return value2;
}
public String value3()
{
    //float altitude;
	return value3;
}
public String value4()
{
    //float altitude;
	return value4;
}
public String value5()
{
    //float altitude;
	return value5;
}
public int pass()
{
    //float altitude;
	return pass;
}
public int fail()
{
    //float altitude;
	return fail;
}
public int pass1()
{
    //float altitude;
	return pass1;
}
public int fail1()
{
    //float altitude;
	return fail1;
}
}