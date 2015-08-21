//import java.io.IOException;
//import java.util.Scanner;
//import jxl.read.biff.BiffException;
//import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.ui.forms.widgets.FormToolkit;
public class Aircraftnew {

	protected Shell shlNext;
	private Text text;
	private Text text_1;
	private Text text_3;
	private Text text_4;
	public static int i;
	private Text txt_gnd;
	private Text txt_gas;
	private Text txt_gup;
	private Label lblPilot;
	private Text txt_gnd1;
	private Text txt_gas1;
	private Text txt_gup1;
	private Label lblCopilot;
	private Label lblGearAirSpeed;
	private Label lblGearUpCommand;
	private Text txt_sound;
	private Button button;
	private Label lblSound;
	private Text txt_value1;
	private Text txt_value2;
	private Text txt_value4;
	private Text txt_value3;
	private Text txt_value5;
	private Label lblGearNotDown;
	private Label label_1;
	private Label lblGearAirSpeed_1;
	private Label lblGearUpCommand_1;
	private Text txt_results;
	private Label label;
	private Label label_2;
	private Text txt_go;
	private Text txt_go1;
	private Text txt_ab1;
	private Text txt_ab;
	private Label label_3;
	private Label label_4;
	//private Button btnNext;
	private Button btnNext_1;
	private Label label_5;
	private Label label_6;
	private Label label_7;
	private Label label_8;
	private Label lblInputs;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Label lblAuto;
	private Text txt_pass1;
	private Text txt_fail1;
	private Label lblVs;
	private Label lblPassVsFail;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Aircraftnew window = new Aircraftnew();
			window.open();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		
		createContents();
		shlNext.open();
		shlNext.layout();
		while (!shlNext.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public int looprun(int i)
	{
			i++;
			while (i<39)
		    {	
				//JOptionPane.showMessageDialog(null, "hi");
				//if()
				//{}	
				try {
					computesimulation.X(i);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}
				text.setText(Float.toString(computesimulation.speed));
				text_1.setText(computesimulation.gearpos);
				text_3.setText(Float.toString(computesimulation.altitude));
				text_4.setText(Float.toString(computesimulation.landtime));
				txt_value1.setText(computesimulation.value1);
				txt_value2.setText(computesimulation.value2);
				txt_value3.setText(computesimulation.value3);
				txt_value4.setText(computesimulation.value4);
				txt_value5.setText(computesimulation.value5);
				txt_pass1.setText(String.valueOf(computesimulation.pass1));
				txt_fail1.setText(String.valueOf(computesimulation.fail1));
				if(computesimulation.pass == 1)
				{
					//JOptionPane.showMessageDialog(null, computesimulation.pass);
					txt_results.setText("Test Case Passed");
					computesimulation.pass=0;
				}
				else
				{//JOptionPane.showMessageDialog(null, computesimulation.fail);
					txt_results.setText("Test Case Failed");
					computesimulation.fail=0;
				}
					//JOptionPane.showMessageDialog(null, computesimulation.gnda+computesimulation.gas+computesimulation.ab+computesimulation.go+computesimulation.gup);
				//joptionpane.showMe
				if(computesimulation.gnda==1 && computesimulation.gas==0 && computesimulation.ab==0 && computesimulation.go==0 && computesimulation.gup==0)
				{	//JOptionPane.showMessageDialog(null, computesimulation.ab);
					//txt_gnd.setText("Set");
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					//txt_gas.setText("");
					//txt_go.setText("");
					//txt_ab.setText("");
					//txt_gup.setText("");
					//txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gnd1.setText("Set");
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_gas1.setText("");
					//txt_go1.setText("");
					//txt_ab1.setText("");
					//txt_gup1.setText("");
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
				}//1stcondition
				if(computesimulation.gnda==1 && computesimulation.gas==0 && computesimulation.ab==1 && computesimulation.go==0 && computesimulation.gup==0)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					//txt_gnd.setText("Set");
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_gas.setText("");
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					//txt_go.setText("");
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setText("Set");
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_gup.setText("");
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gnd1.setText("Set");
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_gas1.setText("");
					//txt_go1.setText("");
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab1.setText("Set");
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gup1.setText("");
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					
				}//2ndcondition
					if(computesimulation.gnda==0 && computesimulation.gas==0 && computesimulation.ab==1 && computesimulation.go==0 && computesimulation.gup==0)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					//txt_gnd.setText("");
					//txt_gas.setText("");
					//txt_go.setText("");
					//txt_ab.setText("Set");
						txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_gup.setText("");
					//txt_gnd1.setText("");
					//txt_gas1.setText("");
					//txt_go1.setText("");
					//txt_ab1.setText("Set");
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
				//	txt_gup1.setText("");
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
				}//3rdcondition
				if(computesimulation.gnda==0 && computesimulation.gas==1 && computesimulation.ab==1 && computesimulation.go==0 && computesimulation.gup==0)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					txt_gnd.setText("");
					//txt_gas.setText("Set");
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					txt_go.setText("");
					//txt_ab.setText("Set");
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gup.setText("");
					txt_gnd1.setText("");
					//txt_gas1.setText("Set");
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_go1.setText("");
					//txt_ab1.setText("Set");
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gup1.setText("");
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					
				}//4thcondition
				if(computesimulation.gnda==0 && computesimulation.gas==1 && computesimulation.ab==0 && computesimulation.go==0 && computesimulation.gup==0)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					txt_gnd.setText("");
					
					//txt_gas.setText("Set");
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_go.setText("");
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					txt_ab.setText("");
					txt_gup.setText("");
					txt_gnd1.setText("");
					//txt_gas1.setText("Set");
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_go1.setText("");
					txt_ab1.setText("");
					txt_gup1.setText("");
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
				}//5thcondition
				if(computesimulation.gnda==0 && computesimulation.gas==1 && computesimulation.ab==1 && computesimulation.go==1 && computesimulation.gup==1)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					txt_gnd.setText("");
					//txt_gas.setText("Set");
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_go.setText("Set");
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_ab.setText("Set");
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					//txt_gup.setText("Set");
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gnd1.setText("");
					//txt_gas1.setText("Set");
					//txt_go1.setText("Set");
					//txt_ab1.setText("Set");
					//txt_gup1.setText("Set");
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
				}//6thcondition
				if(computesimulation.gnda==0 && computesimulation.gas==1 && computesimulation.ab==0 && computesimulation.go==1 && computesimulation.gup==1)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					txt_gnd.setText("");
					//txt_gas.setText("Set");
					//txt_go.setText("Set");
					txt_ab.setText("");
					//txt_gup.setText("Set");
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gnd1.setText("");
					//txt_gas1.setText("Set");
					//txt_go1.setText("Set");
					txt_ab1.setText("");
					//txt_gup1.setText("Set");
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					//txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
				}//7thcondition
				if(computesimulation.gnda==0 && computesimulation.gas==0 && computesimulation.ab==0 && computesimulation.go==0 && computesimulation.gup==0)
				{	//JOptionPane.showMessageDialog(null, computesimulation.gnda);
					txt_gnd.setText("");
					txt_gas.setText("");
					txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setText("");
					txt_ab.setText("");
					txt_gup.setText("");
					txt_gnd1.setText("");
					txt_gas1.setText("");
					txt_go1.setText("");
					txt_ab1.setText("");
					txt_gup1.setText("");
					txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gnd1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gas1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_go1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_ab1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					txt_gup1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
				}//8thcondition
				//btnNext.setSelection(false);
				
				//JOptionPane.showMessageDialog(null, "Hie", null, );
				break;
					
				//}
				//System.out.println(computesimulation.speed);
				//System.out.println(computesimulation.gearpos);
				//System.out.println(computesimulation.altitude);
				//System.out.println(computesimulation.landtime);
				
				//b = sc.next();
				
		    }//Forloop
			return i;
	}
	/**
	 * Create contents of the window.
	 * @return 
	 */
	protected void createContents() {
	//final int i=1;
		shlNext = new Shell();
		shlNext.setSize(794, 428);
		shlNext.setText("Aircraft Simulation");
		shlNext.setLayout(new GridLayout(7, false));
		
		lblInputs = new Label(shlNext, SWT.NONE);
		lblInputs.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblInputs.setText("Inputs");
		new Label(shlNext, SWT.NONE);
		
		lblAuto = formToolkit.createLabel(shlNext, "Automatic", SWT.NONE);
		lblAuto.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblAuto.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		lblPilot = new Label(shlNext, SWT.NONE);
		lblPilot.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblPilot.setText("Pilot");
		new Label(shlNext, SWT.NONE);
		
		lblCopilot = new Label(shlNext, SWT.NONE);
		lblCopilot.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblCopilot.setText("Co-Pilot");
		new Label(shlNext, SWT.NONE);
		
		label_5 = new Label(shlNext, SWT.NONE);
		label_5.setText("Speed");
		label_5.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		text = new Text(shlNext, SWT.BORDER);
		
		text.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_3 = new Label(shlNext, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("Gear Not Down Alarm");
		
		txt_gnd = new Text(shlNext, SWT.BORDER);
		txt_gnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		txt_gnd.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		txt_gnd1 = new Text(shlNext, SWT.BORDER);
		txt_gnd1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		label_6 = new Label(shlNext, SWT.NONE);
		label_6.setText("Gearpos");
		label_6.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		text_1 = new Text(shlNext, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		lblGearAirSpeed = new Label(shlNext, SWT.NONE);
		lblGearAirSpeed.setText("Gear Air Speed Alarm");
		lblGearAirSpeed.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_gas = new Text(shlNext, SWT.BORDER);
		txt_gas.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		txt_gas1 = new Text(shlNext, SWT.BORDER);
		txt_gas1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		label_7 = new Label(shlNext, SWT.NONE);
		label_7.setText("Altitude");
		label_7.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		text_3 = new Text(shlNext, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		label_8 = new Label(shlNext, SWT.NONE);
		label_8.setText("Landtime");
		label_8.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		text_4 = new Text(shlNext, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		label_2 = new Label(shlNext, SWT.NONE);
		label_2.setText("Gear Override Warning\r\n");
		label_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		txt_go = new Text(shlNext, SWT.BORDER);
		txt_go.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		txt_go1 = new Text(shlNext, SWT.BORDER);
		txt_go1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		label = new Label(shlNext, SWT.NONE);
		label.setText("Air Brake Warning\r\n");
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		txt_ab = new Text(shlNext, SWT.BORDER);
		txt_ab.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		txt_ab1 = new Text(shlNext, SWT.BORDER);
		txt_ab1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		lblGearUpCommand = new Label(shlNext, SWT.NONE);
		lblGearUpCommand.setText("Gear Up Command");
		lblGearUpCommand.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_gup = new Text(shlNext, SWT.BORDER);
		txt_gup.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		txt_gup1 = new Text(shlNext, SWT.BORDER);
		txt_gup1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		btnNext_1 = new Button(shlNext, SWT.NONE);
		btnNext_1.addMouseListener(new MouseAdapter() {
			//@Override
			int i=0;
			public void mouseDown(MouseEvent e) {
				i++;
				//JOptionPane.showMessageDialog(null, i);
				looprun(i);
			}
		});
		btnNext_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnNext_1.setText("Next");
		
		lblSound = new Label(shlNext, SWT.NONE);
		lblSound.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblSound.setText("Sound");
		
		txt_sound = new Text(shlNext, SWT.BORDER);
		txt_sound.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		label_1 = new Label(shlNext, SWT.NONE);
		label_1.setText("ExpectedOutputs");
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		button = new Button(shlNext, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				txt_sound.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			}
		});
		button.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		button.setText("Silence alarm");
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		lblGearNotDown = new Label(shlNext, SWT.NONE);
		lblGearNotDown.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblGearNotDown.setText("Gear Not Down");
		
		txt_value1 = new Text(shlNext, SWT.BORDER);
		txt_value1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		lblGearAirSpeed_1 = new Label(shlNext, SWT.NONE);
		lblGearAirSpeed_1.setText("Gear Air Speed");
		lblGearAirSpeed_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_value2 = new Text(shlNext, SWT.BORDER);
		txt_value2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		txt_results = new Text(shlNext, SWT.BORDER);
		txt_results.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		label_3 = new Label(shlNext, SWT.NONE);
		label_3.setText("Gear Over ride");
		label_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_value4 = new Text(shlNext, SWT.BORDER);
		txt_value4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		
		label_4 = new Label(shlNext, SWT.NONE);
		label_4.setText("Air Brake");
		label_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_value3 = new Text(shlNext, SWT.BORDER);
		txt_value3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		lblPassVsFail = formToolkit.createLabel(shlNext, "Pass Vs Fail", SWT.NONE);
		lblPassVsFail.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblPassVsFail.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_pass1 = formToolkit.createText(shlNext, "New Text", SWT.NONE);
		txt_pass1.setText("");
		txt_pass1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblVs = formToolkit.createLabel(shlNext, "vs", SWT.NONE);
		lblVs.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblVs.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		txt_fail1 = formToolkit.createText(shlNext, "New Text", SWT.NONE);
		txt_fail1.setText("");
		txt_fail1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		
		lblGearUpCommand_1 = new Label(shlNext, SWT.NONE);
		lblGearUpCommand_1.setText("Gear Up Command");
		lblGearUpCommand_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		txt_value5 = new Text(shlNext, SWT.BORDER);
		txt_value5.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
		new Label(shlNext, SWT.NONE);
//return i;
	}

}
